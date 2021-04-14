import com.sun.jndi.ldap.pool.Pool;

import javax.print.CancelablePrintJob;
import javax.swing.JOptionPane;

public class Lift {

    public static void main(String[] args) {

        String username =
                JOptionPane.showInputDialog("Кто вы ?:");
        String password =
                JOptionPane.showInputDialog("Ваш пароль:");
        if (username == null || password == null) {
            JOptionPane.showMessageDialog(null, "Недостаточно информации");

        }else if (
                (
                        (username.equals("iggy") ||
                                (username.equals("IGGY"))&&
                                password.equals("horses"))||
        (password.equals("HORSES")||
                                (username.equals("pop") ||
                                        username.equals("POP")&&
                                        password.equals("sweetemotion")||
                                        password.equals("SWEETEMOTIOn"))
                )

        ) ){
            JOptionPane.showMessageDialog(null, "С возвращением !");
        } else {
            JOptionPane.showMessageDialog(null, "Попробуйте заново...");
        }
    }
}





