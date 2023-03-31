package p030d2;

import android.media.DeniedByServerException;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaDrm;
import android.media.MediaDrmException;
import android.media.NotProvisionedException;
import android.media.UnsupportedSchemeException;
import android.media.metrics.LogSessionId;
import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import p004a2.C0079u1;
import p030d2.C4016g0;
import p030d2.C4035m;
import p092m2.C5023l;
import p161w3.C5917a;
import p161w3.C5918a0;
import p161w3.C5953m0;
import p161w3.C5961r;
import p177z1.C6227i;
import p182a7.C6415d;

/* renamed from: d2.k0 */
/* compiled from: FrameworkMediaDrm */
public final class C4031k0 implements C4016g0 {

    /* renamed from: d */
    public static final C4016g0.C4019c f23099d = C9855j0.f39638a;

    /* renamed from: a */
    private final UUID f23100a;

    /* renamed from: b */
    private final MediaDrm f23101b;

    /* renamed from: c */
    private int f23102c = 1;

    /* renamed from: d2.k0$a */
    /* compiled from: FrameworkMediaDrm */
    private static class C4032a {
        /* renamed from: a */
        public static boolean m27815a(MediaDrm mediaDrm, String str) {
            return mediaDrm.requiresSecureDecoder(str);
        }

        /* renamed from: b */
        public static void m27816b(MediaDrm mediaDrm, byte[] bArr, C0079u1 u1Var) {
            LogSessionId a = u1Var.mo214a();
            if (!a.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                ((MediaDrm.PlaybackComponent) C5917a.m34872e(mediaDrm.getPlaybackComponent(bArr))).setLogSessionId(a);
            }
        }
    }

    private C4031k0(UUID uuid) throws UnsupportedSchemeException {
        C5917a.m34872e(uuid);
        C5917a.m34869b(!C6227i.f29961b.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.f23100a = uuid;
        MediaDrm mediaDrm = new MediaDrm(m27795u(uuid));
        this.f23101b = mediaDrm;
        if (C6227i.f29963d.equals(uuid) && m27787B()) {
            m27796w(mediaDrm);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: A */
    public static /* synthetic */ C4016g0 m27786A(UUID uuid) {
        try {
            return m27788C(uuid);
        } catch (C4046p0 unused) {
            C5961r.m35209c("FrameworkMediaDrm", "Failed to instantiate a FrameworkMediaDrm for uuid: " + uuid + ".");
            return new C4006d0();
        }
    }

    /* renamed from: B */
    private static boolean m27787B() {
        return "ASUS_Z00AD".equals(C5953m0.f29113d);
    }

    /* renamed from: C */
    public static C4031k0 m27788C(UUID uuid) throws C4046p0 {
        try {
            return new C4031k0(uuid);
        } catch (UnsupportedSchemeException e) {
            throw new C4046p0(1, e);
        } catch (Exception e2) {
            throw new C4046p0(2, e2);
        }
    }

    /* renamed from: q */
    private static byte[] m27791q(byte[] bArr) {
        C5918a0 a0Var = new C5918a0(bArr);
        int p = a0Var.mo20563p();
        short r = a0Var.mo20565r();
        short r2 = a0Var.mo20565r();
        if (r == 1 && r2 == 1) {
            short r3 = a0Var.mo20565r();
            Charset charset = C6415d.f30666e;
            String A = a0Var.mo20532A(r3, charset);
            if (A.contains("<LA_URL>")) {
                return bArr;
            }
            int indexOf = A.indexOf("</DATA>");
            if (indexOf == -1) {
                C5961r.m35215i("FrameworkMediaDrm", "Could not find the </DATA> tag. Skipping LA_URL workaround.");
            }
            String str = A.substring(0, indexOf) + "<LA_URL>https://x</LA_URL>" + A.substring(indexOf);
            int i = p + 52;
            ByteBuffer allocate = ByteBuffer.allocate(i);
            allocate.order(ByteOrder.LITTLE_ENDIAN);
            allocate.putInt(i);
            allocate.putShort((short) r);
            allocate.putShort((short) r2);
            allocate.putShort((short) (str.length() * 2));
            allocate.put(str.getBytes(charset));
            return allocate.array();
        }
        C5961r.m35212f("FrameworkMediaDrm", "Unexpected record count or type. Skipping LA_URL workaround.");
        return bArr;
    }

    /* renamed from: r */
    private static byte[] m27792r(UUID uuid, byte[] bArr) {
        return C6227i.f29962c.equals(uuid) ? C3999a.m27636a(bArr) : bArr;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0056, code lost:
        if ("AFTT".equals(r0) == false) goto L_0x005f;
     */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static byte[] m27793s(java.util.UUID r3, byte[] r4) {
        /*
            java.util.UUID r0 = p177z1.C6227i.f29964e
            boolean r1 = r0.equals(r3)
            if (r1 == 0) goto L_0x0018
            byte[] r1 = p092m2.C5023l.m31712e(r4, r3)
            if (r1 != 0) goto L_0x000f
            goto L_0x0010
        L_0x000f:
            r4 = r1
        L_0x0010:
            byte[] r4 = m27791q(r4)
            byte[] r4 = p092m2.C5023l.m31708a(r0, r4)
        L_0x0018:
            int r1 = p161w3.C5953m0.f29110a
            r2 = 23
            if (r1 >= r2) goto L_0x0026
            java.util.UUID r1 = p177z1.C6227i.f29963d
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x0058
        L_0x0026:
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x005f
            java.lang.String r0 = p161w3.C5953m0.f29112c
            java.lang.String r1 = "Amazon"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x005f
            java.lang.String r0 = p161w3.C5953m0.f29113d
            java.lang.String r1 = "AFTB"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L_0x0058
            java.lang.String r1 = "AFTS"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L_0x0058
            java.lang.String r1 = "AFTM"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L_0x0058
            java.lang.String r1 = "AFTT"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x005f
        L_0x0058:
            byte[] r3 = p092m2.C5023l.m31712e(r4, r3)
            if (r3 == 0) goto L_0x005f
            return r3
        L_0x005f:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p030d2.C4031k0.m27793s(java.util.UUID, byte[]):byte[]");
    }

    /* renamed from: t */
    private static String m27794t(UUID uuid, String str) {
        return (C5953m0.f29110a >= 26 || !C6227i.f29962c.equals(uuid) || (!"video/mp4".equals(str) && !"audio/mp4".equals(str))) ? str : "cenc";
    }

    /* renamed from: u */
    private static UUID m27795u(UUID uuid) {
        return (C5953m0.f29110a >= 27 || !C6227i.f29962c.equals(uuid)) ? uuid : C6227i.f29961b;
    }

    /* renamed from: w */
    private static void m27796w(MediaDrm mediaDrm) {
        mediaDrm.setPropertyString("securityLevel", "L3");
    }

    /* renamed from: y */
    private static C4035m.C4037b m27797y(UUID uuid, List<C4035m.C4037b> list) {
        boolean z;
        if (!C6227i.f29963d.equals(uuid)) {
            return list.get(0);
        }
        if (C5953m0.f29110a >= 28 && list.size() > 1) {
            C4035m.C4037b bVar = list.get(0);
            int i = 0;
            int i2 = 0;
            while (true) {
                if (i >= list.size()) {
                    z = true;
                    break;
                }
                C4035m.C4037b bVar2 = list.get(i);
                byte[] bArr = (byte[]) C5917a.m34872e(bVar2.f23120e);
                if (!C5953m0.m35124c(bVar2.f23119d, bVar.f23119d) || !C5953m0.m35124c(bVar2.f23118c, bVar.f23118c) || !C5023l.m31710c(bArr)) {
                    z = false;
                } else {
                    i2 += bArr.length;
                    i++;
                }
            }
            z = false;
            if (z) {
                byte[] bArr2 = new byte[i2];
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    byte[] bArr3 = (byte[]) C5917a.m34872e(list.get(i4).f23120e);
                    int length = bArr3.length;
                    System.arraycopy(bArr3, 0, bArr2, i3, length);
                    i3 += length;
                }
                return bVar.mo17241b(bArr2);
            }
        }
        for (int i5 = 0; i5 < list.size(); i5++) {
            C4035m.C4037b bVar3 = list.get(i5);
            int g = C5023l.m31714g((byte[]) C5917a.m34872e(bVar3.f23120e));
            int i6 = C5953m0.f29110a;
            if (i6 < 23 && g == 0) {
                return bVar3;
            }
            if (i6 >= 23 && g == 1) {
                return bVar3;
            }
        }
        return list.get(0);
    }

    /* access modifiers changed from: private */
    /* renamed from: z */
    public /* synthetic */ void m27798z(C4016g0.C4018b bVar, MediaDrm mediaDrm, byte[] bArr, int i, int i2, byte[] bArr2) {
        bVar.mo17202a(this, bArr, i, i2, bArr2);
    }

    /* renamed from: a */
    public synchronized void mo17163a() {
        int i = this.f23102c - 1;
        this.f23102c = i;
        if (i == 0) {
            this.f23101b.release();
        }
    }

    /* renamed from: b */
    public Map<String, String> mo17164b(byte[] bArr) {
        return this.f23101b.queryKeyStatus(bArr);
    }

    /* renamed from: c */
    public C4016g0.C4020d mo17165c() {
        MediaDrm.ProvisionRequest provisionRequest = this.f23101b.getProvisionRequest();
        return new C4016g0.C4020d(provisionRequest.getData(), provisionRequest.getDefaultUrl());
    }

    /* renamed from: d */
    public void mo17166d(byte[] bArr, C0079u1 u1Var) {
        if (C5953m0.f29110a >= 31) {
            try {
                C4032a.m27816b(this.f23101b, bArr, u1Var);
            } catch (UnsupportedOperationException unused) {
                C5961r.m35215i("FrameworkMediaDrm", "setLogSessionId failed.");
            }
        }
    }

    /* renamed from: f */
    public byte[] mo17168f() throws MediaDrmException {
        return this.f23101b.openSession();
    }

    /* renamed from: g */
    public boolean mo17169g(byte[] bArr, String str) {
        if (C5953m0.f29110a >= 31) {
            return C4032a.m27815a(this.f23101b, str);
        }
        try {
            MediaCrypto mediaCrypto = new MediaCrypto(this.f23100a, bArr);
            try {
                return mediaCrypto.requiresSecureDecoderComponent(str);
            } finally {
                mediaCrypto.release();
            }
        } catch (MediaCryptoException unused) {
            return true;
        }
    }

    /* renamed from: h */
    public void mo17170h(byte[] bArr, byte[] bArr2) {
        this.f23101b.restoreKeys(bArr, bArr2);
    }

    /* renamed from: i */
    public void mo17171i(byte[] bArr) {
        this.f23101b.closeSession(bArr);
    }

    /* renamed from: j */
    public byte[] mo17172j(byte[] bArr, byte[] bArr2) throws NotProvisionedException, DeniedByServerException {
        if (C6227i.f29962c.equals(this.f23100a)) {
            bArr2 = C3999a.m27637b(bArr2);
        }
        return this.f23101b.provideKeyResponse(bArr, bArr2);
    }

    /* renamed from: k */
    public void mo17173k(byte[] bArr) throws DeniedByServerException {
        this.f23101b.provideProvisionResponse(bArr);
    }

    /* renamed from: l */
    public C4016g0.C4017a mo17174l(byte[] bArr, List<C4035m.C4037b> list, int i, HashMap<String, String> hashMap) throws NotProvisionedException {
        String str;
        byte[] bArr2;
        C4035m.C4037b bVar = null;
        if (list != null) {
            bVar = m27797y(this.f23100a, list);
            bArr2 = m27793s(this.f23100a, (byte[]) C5917a.m34872e(bVar.f23120e));
            str = m27794t(this.f23100a, bVar.f23119d);
        } else {
            bArr2 = null;
            str = null;
        }
        MediaDrm.KeyRequest keyRequest = this.f23101b.getKeyRequest(bArr, bArr2, str, i, hashMap);
        byte[] r = m27792r(this.f23100a, keyRequest.getData());
        String defaultUrl = keyRequest.getDefaultUrl();
        if ("https://x".equals(defaultUrl)) {
            defaultUrl = "";
        }
        if (TextUtils.isEmpty(defaultUrl) && bVar != null && !TextUtils.isEmpty(bVar.f23118c)) {
            defaultUrl = bVar.f23118c;
        }
        return new C4016g0.C4017a(r, defaultUrl, C5953m0.f29110a >= 23 ? keyRequest.getRequestType() : RecyclerView.UNDEFINED_DURATION);
    }

    /* renamed from: m */
    public int mo17175m() {
        return 2;
    }

    /* renamed from: n */
    public void mo17176n(C4016g0.C4018b bVar) {
        C9853i0 i0Var;
        MediaDrm mediaDrm = this.f23101b;
        if (bVar == null) {
            i0Var = null;
        } else {
            i0Var = new C9853i0(this, bVar);
        }
        mediaDrm.setOnEventListener(i0Var);
    }

    /* renamed from: v */
    public C4030h0 mo17167e(byte[] bArr) throws MediaCryptoException {
        return new C4030h0(m27795u(this.f23100a), bArr, C5953m0.f29110a < 21 && C6227i.f29963d.equals(this.f23100a) && "L3".equals(mo17223x("securityLevel")));
    }

    /* renamed from: x */
    public String mo17223x(String str) {
        return this.f23101b.getPropertyString(str);
    }
}
