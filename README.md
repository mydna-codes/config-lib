# config-lib

---
###**DEPRECATED**

---
[![Build Status](https://jenkins.din-cloud.com/buildStatus/icon?job=mydnacodes%2Fconfig-lib%2Fmaster&subject=CI)](https://jenkins.din-cloud.com/job/mydnacodes/job/config-lib/job/master/)

```bash
mvn clean deploy
```

## etcd module

```xml
<dependencies>
    <dependency>
        <groupId>codes.mydna</groupId>
        <artifactId>config-etcd</artifactId>
        <version>1.0.0-SNAPSHOT</version>
    </dependency>
</dependencies>
```

## etcd keycloak-rbac extension


Provides role-based access control (rbac) for etcd configuration using Keycloak roles.
```xml
<dependencies>
    <dependency>
        <groupId>codes.mydna</groupId>
        <artifactId>config-etcd-keycloak-rbac</artifactId>
        <version>1.0.0-SNAPSHOT</version>
    </dependency>
</dependencies>
```

Needs the following dependencies provided:
```xml
<dependencies>
    <dependency>
        <groupId>codes.mydna</groupId>
        <artifactId>config-etcd</artifactId>
        <version>${config-lib.version}</version>
    </dependency>
    <dependency>
        <groupId>codes.mydna</groupId>
        <artifactId>auth-keycloak</artifactId>
        <version>${auth-lib.version}</version>
    </dependency>
</dependencies>
```