package di.guice.constuctorinjection;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class App {

  public static void main(String[] args) {
    Injector injector = Guice.createInjector(new AppModule());
    House house = injector.getInstance(House.class);
  }
}

