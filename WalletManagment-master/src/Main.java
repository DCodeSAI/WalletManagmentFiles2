import ViewModel.LoginUITemplate;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        Runnable runnable = new Runnable() {
            @Override
            public void run() {

                LoginUITemplate loginUITemplate = new LoginUITemplate();

            }
        };
        SwingUtilities.invokeLater(runnable);
    }
}
