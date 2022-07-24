abstract class Precio {  
    // ...
    abstract int precioEnvio();
  }
  
  class PrecioMunicipal extends Precio {  
      @Override
      int precioEnvio() { return 5000; }
  }
  
  class PrecioNacional extends Precio {  
      @Override
      int precioEnvio() { return 15000; }
  }
  
  class PrecioInternacional extends Precio {  
      @Override
      int precioEnvio() { return 25000; }
  }