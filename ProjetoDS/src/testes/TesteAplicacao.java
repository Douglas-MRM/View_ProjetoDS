package testes;

import view.viewLogin;
import view.viewMenu;

/**
 *
 * @author Sara
 */
public class TesteAplicacao {

    public static void main(String[] args) {
        viewLogin form = new viewLogin();
        form.setLocationRelativeTo(form);
        form.setVisible(true);
    }

}
