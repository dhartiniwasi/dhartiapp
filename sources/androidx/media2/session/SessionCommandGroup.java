package androidx.media2.session;

import androidx.core.util.C0825c;
import java.util.HashSet;
import java.util.Set;
import p152v0.C5755b;

public final class SessionCommandGroup implements C5755b {

    /* renamed from: a */
    Set<SessionCommand> f3633a = new HashSet();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SessionCommandGroup)) {
            return false;
        }
        SessionCommandGroup sessionCommandGroup = (SessionCommandGroup) obj;
        Set<SessionCommand> set = this.f3633a;
        if (set != null) {
            return set.equals(sessionCommandGroup.f3633a);
        }
        if (sessionCommandGroup.f3633a == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return C0825c.m3644c(this.f3633a);
    }
}
