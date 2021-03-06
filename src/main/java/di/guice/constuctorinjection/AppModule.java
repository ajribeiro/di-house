package di.guice.constuctorinjection;

import com.google.inject.AbstractModule;
import com.google.inject.Singleton;
import com.google.inject.name.Names;

public class AppModule extends AbstractModule {

  @Override
  public void configure() {
    bind(Sink.class)
        .annotatedWith(Names.named("Kitchen"))
        .to(KitchenSink.class)
        .in(Singleton.class);
    bind(Sink.class).annotatedWith(Names.named("Bathroom")).to(BathroomSink.class);
  }
}
