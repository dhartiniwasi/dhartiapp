package p343rc;

import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p182a7.C6431n;
import p343rc.C12271a;

/* renamed from: rc.x */
/* compiled from: EquivalentAddressGroup */
public final class C12406x {

    /* renamed from: d */
    public static final C12271a.C12274c<String> f45750d = C12271a.C12274c.m58939a("io.grpc.EquivalentAddressGroup.ATTR_AUTHORITY_OVERRIDE");

    /* renamed from: a */
    private final List<SocketAddress> f45751a;

    /* renamed from: b */
    private final C12271a f45752b;

    /* renamed from: c */
    private final int f45753c;

    public C12406x(List<SocketAddress> list) {
        this(list, C12271a.f45491c);
    }

    /* renamed from: a */
    public List<SocketAddress> mo37149a() {
        return this.f45751a;
    }

    /* renamed from: b */
    public C12271a mo37150b() {
        return this.f45752b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C12406x)) {
            return false;
        }
        C12406x xVar = (C12406x) obj;
        if (this.f45751a.size() != xVar.f45751a.size()) {
            return false;
        }
        for (int i = 0; i < this.f45751a.size(); i++) {
            if (!this.f45751a.get(i).equals(xVar.f45751a.get(i))) {
                return false;
            }
        }
        if (!this.f45752b.equals(xVar.f45752b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.f45753c;
    }

    public String toString() {
        return "[" + this.f45751a + "/" + this.f45752b + "]";
    }

    public C12406x(List<SocketAddress> list, C12271a aVar) {
        C6431n.m37552e(!list.isEmpty(), "addrs is empty");
        List<SocketAddress> unmodifiableList = Collections.unmodifiableList(new ArrayList(list));
        this.f45751a = unmodifiableList;
        this.f45752b = (C12271a) C6431n.m37562o(aVar, "attrs");
        this.f45753c = unmodifiableList.hashCode();
    }

    public C12406x(SocketAddress socketAddress) {
        this(socketAddress, C12271a.f45491c);
    }

    public C12406x(SocketAddress socketAddress, C12271a aVar) {
        this((List<SocketAddress>) Collections.singletonList(socketAddress), aVar);
    }
}
