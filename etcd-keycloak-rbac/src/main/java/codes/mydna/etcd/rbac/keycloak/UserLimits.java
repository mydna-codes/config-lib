package codes.mydna.etcd.rbac.keycloak;

import codes.mydna.auth.common.Roles;
import codes.mydna.auth.common.User;
import codes.mydna.config.etcd.ConfigUserLimits;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.List;

@ApplicationScoped
public class UserLimits {

    @Inject
    private ConfigUserLimits config;

    public int getMaxDnaLength(User user) {

        if (user == null)
            return -1;

        List<String> realmRoles = user.getRealmRoles();

        if (realmRoles.contains(Roles.KeycloakRealmRole.ADMIN)
                || realmRoles.contains(Roles.KeycloakRealmRole.PRO_USER))
            return config.getProMaxDnaLength();

        if (realmRoles.contains(Roles.KeycloakRealmRole.USER))
            return config.getRegMaxDnaLength();

        return config.getGuestMaxDnaLength();
    }

    public int getMaxEnzymeLength(User user) {

        if (user == null)
            return -1;

        List<String> realmRoles = user.getRealmRoles();

        if (realmRoles.contains(Roles.KeycloakRealmRole.ADMIN)
                || realmRoles.contains(Roles.KeycloakRealmRole.PRO_USER))
            return config.getProMaxEnzymeLength();

        if (realmRoles.contains(Roles.KeycloakRealmRole.USER))
            return config.getRegMaxEnzymeLength();

        return config.getGuestMaxEnzymeLength();
    }

    public int getMaxGeneLength(User user) {

        if (user == null)
            return -1;

        List<String> realmRoles = user.getRealmRoles();

        if (realmRoles.contains(Roles.KeycloakRealmRole.ADMIN)
                || realmRoles.contains(Roles.KeycloakRealmRole.PRO_USER))
            return config.getProMaxGeneLength();

        if (realmRoles.contains(Roles.KeycloakRealmRole.USER))
            return config.getRegMaxGeneLength();

        return config.getGuestMaxGeneLength();
    }

}
