package dao;

import dto.UsuarioDTO;

public class UsuarioDAO {

    public boolean autenticarUsuario(UsuarioDTO usuarioDTO) {
        String usuarioCorreto = "admin";
        String senhaCorreta = "1234";

        return usuarioDTO.getUsuario().equals(usuarioCorreto)
                && usuarioDTO.getSenha().equals(senhaCorreta);
    }
}
