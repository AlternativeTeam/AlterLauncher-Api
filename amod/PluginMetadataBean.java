import java.util.Objects;

public class PluginMetadataBean {
    private String icon = "default";
    private String name;
    private String description;
    private String version;
    private String author;
    private String nativePath;
    private String plugin;
    private String importClass;
    private String framework = "LeviLauncher";
    private int maxVersion = 1;
    private int minVersion = 0;
    private int protocol = 1;

    // 默认构造器
    public PluginMetadataBean() {}

    // 全参数构造器
    public PluginMetadataBean(String icon, String name, String description, String version, 
                             String author, String nativePath, String plugin, String importClass,
                             String framework, int maxVersion, int minVersion, int protocol) {
        this.icon = icon;
        this.name = name;
        this.description = description;
        this.version = version;
        this.author = author;
        this.nativePath = nativePath;
        this.plugin = plugin;
        this.importClass = importClass;
        this.framework = framework;
        this.maxVersion = maxVersion;
        this.minVersion = minVersion;
        this.protocol = protocol;
    }

    // Getter 和 Setter 方法
    public String getIcon() { return icon; }
    public void setIcon(String icon) { this.icon = icon; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public String getVersion() { return version; }
    public void setVersion(String version) { this.version = version; }

    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }

    public String getNativePath() { return nativePath; }
    public void setNativePath(String nativePath) { this.nativePath = nativePath; }

    public String getPlugin() { return plugin; }
    public void setPlugin(String plugin) { this.plugin = plugin; }

    public String getImportClass() { return importClass; }
    public void setImportClass(String importClass) { this.importClass = importClass; }

    public String getFramework() { return framework; }
    public void setFramework(String framework) { this.framework = framework; }

    public int getMaxVersion() { return maxVersion; }
    public void setMaxVersion(int maxVersion) { this.maxVersion = maxVersion; }

    public int getMinVersion() { return minVersion; }
    public void setMinVersion(int minVersion) { this.minVersion = minVersion; }

    public int getProtocol() { return protocol; }
    public void setProtocol(int protocol) { this.protocol = protocol; }

    // equals 和 hashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PluginMetadataBean that = (PluginMetadataBean) o;
        return maxVersion == that.maxVersion && 
               minVersion == that.minVersion && 
               protocol == that.protocol &&
               Objects.equals(icon, that.icon) &&
               Objects.equals(name, that.name) &&
               Objects.equals(description, that.description) &&
               Objects.equals(version, that.version) &&
               Objects.equals(author, that.author) &&
               Objects.equals(nativePath, that.nativePath) &&
               Objects.equals(plugin, that.plugin) &&
               Objects.equals(importClass, that.importClass) &&
               Objects.equals(framework, that.framework);
    }

    @Override
    public int hashCode() {
        return Objects.hash(icon, name, description, version, author, nativePath, 
                           plugin, importClass, framework, maxVersion, minVersion, protocol);
    }

    @Override
    public String toString() {
        return "PluginMetadataBean{" +
                "icon='" + icon + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", version='" + version + '\'' +
                ", author='" + author + '\'' +
                ", nativePath='" + nativePath + '\'' +
                ", plugin='" + plugin + '\'' +
                ", importClass='" + importClass + '\'' +
                ", framework='" + framework + '\'' +
                ", maxVersion=" + maxVersion +
                ", minVersion=" + minVersion +
                ", protocol=" + protocol +
                '}';
    }
}
