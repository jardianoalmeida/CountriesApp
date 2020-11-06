package br.com.jardiano.countriesapp.viewmodel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.ArrayList;
import java.util.List;

import br.com.jardiano.countriesapp.model.CountryModel;

public class ListViewModel extends ViewModel {
    public MutableLiveData<List<CountryModel>> countries = new MutableLiveData<List<CountryModel>>()
    public MutableLiveData<Boolean> countryLoadErro = new MutableLiveData<Boolean>();
    public MutableLiveData<Boolean> loading = new MutableLiveData<Boolean>();

    protected void refresh(){
        fetchCountries();
    }

    protected void fetchCountries(){
        CountryModel country1 = new CountryModel("Albania", "Tirana", "");
        CountryModel country2 = new CountryModel("Brasil", "Brasil", "");
        CountryModel country3 = new CountryModel("Czechia", "Praba", "");

        List<CountryModel> list = new ArrayList<>();
        list.add(country1);
        list.add(country2);
        list.add(country3);

        countries.setValue(list);
        countryLoadErro.setValue(false);
        loading.setValue(false);
    }
}
