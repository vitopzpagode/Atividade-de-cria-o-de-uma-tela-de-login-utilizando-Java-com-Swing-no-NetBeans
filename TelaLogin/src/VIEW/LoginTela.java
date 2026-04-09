package view;

import dao.UsuarioDAO;
import dto.UsuarioDTO;
import javax.swing.JOptionPane;

public class LoginTela extends javax.swing.JFrame {

    public LoginTela() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        lblUsuario = new javax.swing.JLabel("Usuário:");
        txtUsuario = new javax.swing.JTextField();
        lblSenha = new javax.swing.JLabel("Senha:");
        txtSenha = new javax.swing.JPasswordField();
        btnEntrar = new javax.swing.JButton("Entrar");
        lblMensagem = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela de Login");

        btnEntrar.addActionListener(evt -> btnEntrarActionPerformed());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);

        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
            .addGroup(layout.createSequentialGroup()
                .addGap(40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblUsuario)
                    .addComponent(txtUsuario, 200, 200, 200)
                    .addComponent(lblSenha)
                    .addComponent(txtSenha, 200, 200, 200)
                    .addComponent(btnEntrar)
                    .addComponent(lblMensagem))
                .addGap(40))
        );

        layout.setVerticalGroup(
            layout.createSequentialGroup()
                .addGap(30)
                .addComponent(lblUsuario)
                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10)
                .addComponent(lblSenha)
                .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20)
                .addComponent(btnEntrar)
                .addGap(20)
                .addComponent(lblMensagem)
                .addGap(30)
        );

        pack();
        setLocationRelativeTo(null);
    }

    private void btnEntrarActionPerformed() {

        String usuario = txtUsuario.getText().trim();
        String senha = new String(txtSenha.getPassword());

        // Validação
        if (usuario.isEmpty() || senha.isEmpty()) {
            lblMensagem.setText("Preencha todos os campos!");
            return;
        }

        try {
            // DTO
            UsuarioDTO dto = new UsuarioDTO();
            dto.setUsuario(usuario);
            dto.setSenha(senha);

            // DAO
            UsuarioDAO dao = new UsuarioDAO();

            boolean autenticado = dao.autenticarUsuario(dto);

            if (autenticado) {
                lblMensagem.setText("Login realizado com sucesso!");
                
                // Exemplo: abrir outra tela
                // new TelaPrincipal().setVisible(true);
                // this.dispose();

            } else {
                lblMensagem.setText("Usuário ou senha incorretos!");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro ao realizar login: " + e.getMessage());
        }
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new LoginTela().setVisible(true));
    }

    // Variáveis
    private javax.swing.JButton btnEntrar;
    private javax.swing.JLabel lblMensagem;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JTextField txtUsuario;
}