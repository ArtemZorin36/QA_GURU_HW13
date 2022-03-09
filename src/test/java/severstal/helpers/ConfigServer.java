package severstal.helpers;

import org.aeonbits.owner.Config;

@Config.Sources("classpath:config/ConfigServer.properties")
public interface ConfigServer extends Config {
    @Key("https.server.host")
    String hostname();

    @Key("server.host.login")
    @DefaultValue("user1")
    String login();

    @Key("server.host.password")
    @DefaultValue("1234")
    String password();
}