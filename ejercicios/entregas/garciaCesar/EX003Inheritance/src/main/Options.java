package src.main;
public class Options {
    private String options[];
    private int selectedOption;
    private int maxOptions;

    public Options() {
        this.maxOptions = maxOptions;
        this.options = new String[maxOptions];
        this.selectedOption = 0;
    }

    public void addOption(String option) {
        if (selectedOption < maxOptions) {
            options[selectedOption++] = option;
        }
    }

    public String getOption(int index) {
        return options[index];
    }

    public void selectOption(int index) {
        if (index >= 0 && index < maxOptions) {
            selectedOption = index;
            if (options[selectedOption] == null) {
                selectedOption = 0;
            }
        }
    }

    public String getSelectedOption() {
        return options[selectedOption];
    }
}

