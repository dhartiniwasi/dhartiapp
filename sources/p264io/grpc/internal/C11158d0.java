package p264io.grpc.internal;

import java.net.URI;
import p182a7.C6431n;
import p182a7.C6441r;
import p343rc.C12276a1;
import p343rc.C12291b1;
import p343rc.C12358n0;

/* renamed from: io.grpc.internal.d0 */
/* compiled from: DnsNameResolverProvider */
public final class C11158d0 extends C12291b1 {
    /* renamed from: a */
    public String mo35026a() {
        return "dns";
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public boolean mo35028d() {
        return true;
    }

    /* renamed from: e */
    public int mo35029e() {
        return 5;
    }

    /* renamed from: f */
    public C11138c0 mo35027b(URI uri, C12276a1.C12278b bVar) {
        if (!"dns".equals(uri.getScheme())) {
            return null;
        }
        String str = (String) C6431n.m37562o(uri.getPath(), "targetPath");
        C6431n.m37558k(str.startsWith("/"), "the path component (%s) of the target (%s) must start with '/'", str, uri);
        return new C11138c0(uri.getAuthority(), str.substring(1), bVar, C11335r0.f43547u, C6441r.m37595c(), C12358n0.m59171a(C11158d0.class.getClassLoader()));
    }
}
