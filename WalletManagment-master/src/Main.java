import ViewModel.Login.LoginComponent;
import ViewModel.Login.LoginUITemplate;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        Runnable runnable = new Runnable() {
            @Override
            public void run() {

                LoginComponent loginComponent =new LoginComponent();
                loginComponent.getClass();

            }
        };
        SwingUtilities.invokeLater(runnable);
    }
}
