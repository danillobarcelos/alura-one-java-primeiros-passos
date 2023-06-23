package bytebankHerdado;
//contrato Autenticavel
	//quem assinar este contrato precisa implementar
		// metodo gerSenha()
		// metodo autentica()
public abstract interface Autenticavel {

    public abstract void setSenha(int senha);

    public abstract boolean autentica(int senha);
}
