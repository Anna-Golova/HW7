package Lesson7;

public final class ApplicationGlobalState {

    private static HW7.ApplicationGlobalState INSTANCE;
    private String selectedCity = null;
    private final String API_KEY = "0d1tNZJPfzzT3qGokM18FGGxAUpt7hpj";

    private ApplicationGlobalState() {
    }

    public static HW7.ApplicationGlobalState getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new HW7.ApplicationGlobalState();
        }

        return INSTANCE;
    }

    public String getSelectedCity() {
        return selectedCity;
    }

    public void setSelectedCity(String selectedCity) {
        this.selectedCity = selectedCity;
    }

    public String getApiKey() {
        return this.API_KEY;
    }
}
