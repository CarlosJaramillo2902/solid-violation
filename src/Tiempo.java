abstract class Tiempo {  
    // ...
    abstract int tiempoEnvio();
  }
  
  class Municipal extends Tiempo {  
      @Override
      int tiempoEnvio() { return 12; }
  }
  
  class Nacional extends Tiempo {  
      @Override
      int tiempoEnvio() { return 36; }
  }
  
  class Internacional extends Tiempo {  
      @Override
      int tiempoEnvio() { return 90; }
  }
  
