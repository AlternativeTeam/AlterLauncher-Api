import java.util.Objects;

public record PluginMetadata(
    String icon,
    String name,
    String description,
    String version,
    String author,
    String nativePath,
    String plugin,
    String importClass,
    String framework,
    int maxVersion,
    int minVersion,
    int protocol
) {
    public PluginMetadata {
        Objects.requireNonNull(name, "Plugin name cannot be null");
        Objects.requireNonNull(version, "Plugin version cannot be null");
    }
}
