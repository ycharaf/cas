package org.apereo.cas.impersonate;

import org.apereo.cas.authentication.UsernamePasswordCredential;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Credential for authenticating with a username and password.
 *
 * @author Scott Battaglia
 * @author Marvin S. Addison
 * @since 3.0.0
 */
public class ImpUsernamePasswordCredential extends UsernamePasswordCredential {


    @NotNull
    @Size(min=1,message="required.username")
    private String impname;

    public final String getImpname() {
        return this.impname;
    }

    public final void setImpname(final String userName) {
        this.impname = userName;
    }

}
