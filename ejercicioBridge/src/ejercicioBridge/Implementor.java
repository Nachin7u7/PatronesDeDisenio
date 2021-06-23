package ejercicioBridge;

public interface Implementor {

	enum envio {
		Aire, Tierra, Mar
	}

	void tipoDeEnvio(envio env);

}