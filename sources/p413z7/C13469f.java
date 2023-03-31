package p413z7;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import org.json.JSONException;
import org.json.JSONObject;
import p247h8.C10468v;

/* renamed from: z7.f */
/* compiled from: BundleReader */
public class C13469f {

    /* renamed from: g */
    private static final Charset f47823g = Charset.forName("UTF-8");

    /* renamed from: a */
    private final C13470g f47824a;

    /* renamed from: b */
    private final InputStream f47825b;

    /* renamed from: c */
    private final InputStreamReader f47826c;

    /* renamed from: d */
    C13468e f47827d;

    /* renamed from: e */
    private ByteBuffer f47828e;

    /* renamed from: f */
    long f47829f;

    public C13469f(C13470g gVar, InputStream inputStream) {
        this.f47824a = gVar;
        this.f47825b = inputStream;
        this.f47826c = new InputStreamReader(inputStream);
        ByteBuffer allocate = ByteBuffer.allocate(1024);
        this.f47828e = allocate;
        allocate.flip();
    }

    /* renamed from: a */
    private IllegalArgumentException m62507a(String str) throws IOException {
        mo38571b();
        throw new IllegalArgumentException("Invalid bundle: " + str);
    }

    /* renamed from: c */
    private C13466c m62508c(String str) throws JSONException, IOException {
        JSONObject jSONObject = new JSONObject(str);
        if (jSONObject.has("metadata")) {
            C13468e b = this.f47824a.mo38575b(jSONObject.getJSONObject("metadata"));
            C10468v.m52767a("BundleElement", "BundleMetadata element loaded", new Object[0]);
            return b;
        } else if (jSONObject.has("namedQuery")) {
            C13473j q = this.f47824a.mo38578q(jSONObject.getJSONObject("namedQuery"));
            C10468v.m52767a("BundleElement", "Query loaded: " + q.mo38590b(), new Object[0]);
            return q;
        } else if (jSONObject.has("documentMetadata")) {
            C13471h c = this.f47824a.mo38576c(jSONObject.getJSONObject("documentMetadata"));
            C10468v.m52767a("BundleElement", "Document metadata loaded: " + c.mo38580b(), new Object[0]);
            return c;
        } else if (jSONObject.has("document")) {
            C13465b f = this.f47824a.mo38577f(jSONObject.getJSONObject("document"));
            C10468v.m52767a("BundleElement", "Document loaded: " + f.mo38559b(), new Object[0]);
            return f;
        } else {
            throw m62507a("Cannot decode unknown Bundle element: " + str);
        }
    }

    /* renamed from: g */
    private int m62509g() {
        this.f47828e.mark();
        int i = 0;
        while (true) {
            try {
                if (i >= this.f47828e.remaining()) {
                    i = -1;
                    break;
                } else if (this.f47828e.get() == 123) {
                    break;
                } else {
                    i++;
                }
            } finally {
                this.f47828e.reset();
            }
        }
        return i;
    }

    /* renamed from: h */
    private boolean m62510h() throws IOException {
        this.f47828e.compact();
        int read = this.f47825b.read(this.f47828e.array(), this.f47828e.arrayOffset() + this.f47828e.position(), this.f47828e.remaining());
        boolean z = read > 0;
        if (z) {
            ByteBuffer byteBuffer = this.f47828e;
            byteBuffer.position(byteBuffer.position() + read);
        }
        this.f47828e.flip();
        return z;
    }

    /* renamed from: i */
    private String m62511i(int i) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (i > 0) {
            if (this.f47828e.remaining() != 0 || m62510h()) {
                int min = Math.min(i, this.f47828e.remaining());
                byteArrayOutputStream.write(this.f47828e.array(), this.f47828e.arrayOffset() + this.f47828e.position(), min);
                ByteBuffer byteBuffer = this.f47828e;
                byteBuffer.position(byteBuffer.position() + min);
                i -= min;
            } else {
                throw m62507a("Reached the end of bundle when more data was expected.");
            }
        }
        return byteArrayOutputStream.toString(f47823g.name());
    }

    /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* renamed from: j */
    private java.lang.String m62512j() throws java.io.IOException {
        /*
            r3 = this;
        L_0x0000:
            int r0 = r3.m62509g()
            r1 = -1
            if (r0 != r1) goto L_0x000d
            boolean r2 = r3.m62510h()
            if (r2 != 0) goto L_0x0000
        L_0x000d:
            java.nio.ByteBuffer r2 = r3.f47828e
            int r2 = r2.remaining()
            if (r2 != 0) goto L_0x0017
            r0 = 0
            return r0
        L_0x0017:
            if (r0 == r1) goto L_0x002f
            byte[] r0 = new byte[r0]
            java.nio.ByteBuffer r1 = r3.f47828e
            r1.get(r0)
            java.nio.charset.Charset r1 = f47823g
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r0)
            java.nio.CharBuffer r0 = r1.decode(r0)
            java.lang.String r0 = r0.toString()
            return r0
        L_0x002f:
            java.lang.String r0 = "Reached the end of bundle when a length string is expected."
            java.lang.IllegalArgumentException r0 = r3.m62507a(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p413z7.C13469f.m62512j():java.lang.String");
    }

    /* renamed from: k */
    private C13466c m62513k() throws IOException, JSONException {
        String j = m62512j();
        if (j == null) {
            return null;
        }
        int parseInt = Integer.parseInt(j);
        String i = m62511i(parseInt);
        this.f47829f += (long) (j.getBytes(f47823g).length + parseInt);
        return m62508c(i);
    }

    /* renamed from: b */
    public void mo38571b() throws IOException {
        this.f47825b.close();
    }

    /* renamed from: d */
    public C13468e mo38572d() throws IOException, JSONException {
        C13468e eVar = this.f47827d;
        if (eVar != null) {
            return eVar;
        }
        C13466c k = m62513k();
        if (k instanceof C13468e) {
            C13468e eVar2 = (C13468e) k;
            this.f47827d = eVar2;
            this.f47829f = 0;
            return eVar2;
        }
        throw m62507a("Expected first element in bundle to be a metadata object");
    }

    /* renamed from: e */
    public long mo38573e() {
        return this.f47829f;
    }

    /* renamed from: f */
    public C13466c mo38574f() throws IOException, JSONException {
        mo38572d();
        return m62513k();
    }
}
