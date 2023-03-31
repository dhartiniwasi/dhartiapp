package androidx.media2.session;

import p152v0.C5755b;

public final class SessionToken implements C5755b {

    /* renamed from: a */
    SessionTokenImpl f3639a;

    interface SessionTokenImpl extends C5755b {
    }

    SessionToken() {
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof SessionToken)) {
            return false;
        }
        return this.f3639a.equals(((SessionToken) obj).f3639a);
    }

    public int hashCode() {
        return this.f3639a.hashCode();
    }

    public String toString() {
        return this.f3639a.toString();
    }
}
