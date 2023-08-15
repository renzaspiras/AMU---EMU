import javax.swing.SwingUtilities;

public class Core {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new Body();
        });
    }
}
