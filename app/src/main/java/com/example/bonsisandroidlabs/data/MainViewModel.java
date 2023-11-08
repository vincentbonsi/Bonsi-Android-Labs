package com.example.bonsisandroidlabs.data;



import androidx.lifecycle.MutableLiveData;
        import androidx.lifecycle.ViewModel;

public class MainViewModel extends ViewModel {
    private MutableLiveData<String> userInput = new MutableLiveData<>();

    public void setUserInput(String input) {
        userInput.setValue(input);
    }

    public MutableLiveData<String> getUserInput() {
        return userInput;
    }

    public int getEditString() {
        return 0;
    }
}
