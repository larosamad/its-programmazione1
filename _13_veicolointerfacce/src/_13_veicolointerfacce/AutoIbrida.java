package _13_veicolointerfacce;

public class AutoIbrida extends Veicolo implements Connettività, Ricaricabile {
    private boolean connesso;

    public AutoIbrida(int batteria) {
    	super(batteria);
        this.connesso = false;
    }

    @Override
    public void connetti() {
        this.connesso = true;
        System.out.println("Bluetooth connesso");
    }

    @Override
    public void disconnetti() {
        this.connesso = false;
        System.out.println("Bluetooth disconnesso");
    }

    @Override
    public boolean isConnesso() {
        return this.connesso;
    }

    @Override
    public void ricarica() {
    	batteria = 100;
    }
    
}