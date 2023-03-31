package p343rc;

import java.nio.charset.Charset;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import p182a7.C6418g;
import p182a7.C6431n;
import p343rc.C12346l;

/* renamed from: rc.v */
/* compiled from: DecompressorRegistry */
public final class C12400v {

    /* renamed from: c */
    static final C6418g f45744c = C6418g.m37520e(',');

    /* renamed from: d */
    private static final C12400v f45745d = m59293a().mo37142f(new C12346l.C12347a(), true).mo37142f(C12346l.C12348b.f45659a, false);

    /* renamed from: a */
    private final Map<String, C12401a> f45746a;

    /* renamed from: b */
    private final byte[] f45747b;

    /* renamed from: rc.v$a */
    /* compiled from: DecompressorRegistry */
    private static final class C12401a {

        /* renamed from: a */
        final C12398u f45748a;

        /* renamed from: b */
        final boolean f45749b;

        C12401a(C12398u uVar, boolean z) {
            this.f45748a = (C12398u) C6431n.m37562o(uVar, "decompressor");
            this.f45749b = z;
        }
    }

    private C12400v(C12398u uVar, boolean z, C12400v vVar) {
        String a = uVar.mo37049a();
        C6431n.m37552e(!a.contains(","), "Comma is currently not allowed in message encoding");
        int size = vVar.f45746a.size();
        LinkedHashMap linkedHashMap = new LinkedHashMap(!vVar.f45746a.containsKey(uVar.mo37049a()) ? size + 1 : size);
        for (C12401a next : vVar.f45746a.values()) {
            String a2 = next.f45748a.mo37049a();
            if (!a2.equals(a)) {
                linkedHashMap.put(a2, new C12401a(next.f45748a, next.f45749b));
            }
        }
        linkedHashMap.put(a, new C12401a(uVar, z));
        this.f45746a = Collections.unmodifiableMap(linkedHashMap);
        this.f45747b = f45744c.mo21836c(mo37139b()).getBytes(Charset.forName("US-ASCII"));
    }

    /* renamed from: a */
    public static C12400v m59293a() {
        return new C12400v();
    }

    /* renamed from: c */
    public static C12400v m59294c() {
        return f45745d;
    }

    /* renamed from: b */
    public Set<String> mo37139b() {
        HashSet hashSet = new HashSet(this.f45746a.size());
        for (Map.Entry next : this.f45746a.entrySet()) {
            if (((C12401a) next.getValue()).f45749b) {
                hashSet.add((String) next.getKey());
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public byte[] mo37140d() {
        return this.f45747b;
    }

    /* renamed from: e */
    public C12398u mo37141e(String str) {
        C12401a aVar = this.f45746a.get(str);
        if (aVar != null) {
            return aVar.f45748a;
        }
        return null;
    }

    /* renamed from: f */
    public C12400v mo37142f(C12398u uVar, boolean z) {
        return new C12400v(uVar, z, this);
    }

    private C12400v() {
        this.f45746a = new LinkedHashMap(0);
        this.f45747b = new byte[0];
    }
}
