package p264io.flutter.plugins.googlemobileads;

import android.content.Context;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;
import p179z3.C6351u;
import p186ac.C6568r;
import p264io.flutter.plugins.googlemobileads.C10823d0;
import p264io.flutter.plugins.googlemobileads.C10826e;
import p264io.flutter.plugins.googlemobileads.C10843i;
import p264io.flutter.plugins.googlemobileads.C10853l;
import p264io.flutter.plugins.googlemobileads.C10855m;
import p264io.flutter.plugins.googlemobileads.C10862o;

/* renamed from: io.flutter.plugins.googlemobileads.b */
/* compiled from: AdMessageCodec */
class C10816b extends C6568r {

    /* renamed from: d */
    Context f42255d;

    /* renamed from: e */
    final C10855m.C10856a f42256e = new C10855m.C10856a();

    /* renamed from: f */
    private C10850j0 f42257f;

    /* renamed from: g */
    private final C10820c0 f42258g;

    /* renamed from: io.flutter.plugins.googlemobileads.b$a */
    /* compiled from: AdMessageCodec */
    static /* synthetic */ class C10817a {

        /* renamed from: a */
        static final /* synthetic */ int[] f42259a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                io.flutter.plugins.googlemobileads.o$b[] r0 = p264io.flutter.plugins.googlemobileads.C10862o.C10864b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f42259a = r0
                io.flutter.plugins.googlemobileads.o$b r1 = p264io.flutter.plugins.googlemobileads.C10862o.C10864b.NOT_READY     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f42259a     // Catch:{ NoSuchFieldError -> 0x001d }
                io.flutter.plugins.googlemobileads.o$b r1 = p264io.flutter.plugins.googlemobileads.C10862o.C10864b.READY     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p264io.flutter.plugins.googlemobileads.C10816b.C10817a.<clinit>():void");
        }
    }

    C10816b(Context context, C10820c0 c0Var) {
        this.f42255d = context;
        this.f42258g = c0Var;
    }

    /* renamed from: q */
    private static Boolean m54073q(Object obj) {
        if (obj == null) {
            return null;
        }
        return (Boolean) obj;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public Object mo22176g(byte b, ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2 = byteBuffer;
        switch (b) {
            case Byte.MIN_VALUE:
                try {
                    return new C10855m(((Integer) mo22176g(byteBuffer.get(), byteBuffer2)).intValue(), ((Integer) mo22176g(byteBuffer.get(), byteBuffer2)).intValue());
                } catch (Throwable th) {
                    throw th;
                }
            case -127:
                return new C10853l.C10854a().mo34579n((List) mo22176g(byteBuffer.get(), byteBuffer2)).mo34577l((String) mo22176g(byteBuffer.get(), byteBuffer2)).mo34583r(m54073q(mo22176g(byteBuffer.get(), byteBuffer2))).mo34582q((List) mo22176g(byteBuffer.get(), byteBuffer2)).mo34578m((Integer) mo22176g(byteBuffer.get(), byteBuffer2)).mo34580o((String) mo22176g(byteBuffer.get(), byteBuffer2)).mo34581p(this.f42257f).mo34576k((Map) mo22176g(byteBuffer.get(), byteBuffer2)).mo34584s(this.f42258g.mo34476a()).mo34545a();
            case -126:
                return new C10855m.C10858c();
            case -124:
                return new C10823d0.C10825b((Integer) mo22176g(byteBuffer.get(), byteBuffer2), (String) mo22176g(byteBuffer.get(), byteBuffer2));
            case -123:
                return new C10826e.C10829c(((Integer) mo22176g(byteBuffer.get(), byteBuffer2)).intValue(), (String) mo22176g(byteBuffer.get(), byteBuffer2), (String) mo22176g(byteBuffer.get(), byteBuffer2), (C10826e.C10831e) mo22176g(byteBuffer.get(), byteBuffer2));
            case -122:
                C10843i.C10845b bVar = new C10843i.C10845b();
                bVar.mo34579n((List) mo22176g(byteBuffer.get(), byteBuffer2));
                bVar.mo34577l((String) mo22176g(byteBuffer.get(), byteBuffer2));
                bVar.mo34547u((Map) mo22176g(byteBuffer.get(), byteBuffer2));
                bVar.mo34548v((Map) mo22176g(byteBuffer.get(), byteBuffer2));
                bVar.mo34583r((Boolean) mo22176g(byteBuffer.get(), byteBuffer2));
                bVar.mo34582q((List) mo22176g(byteBuffer.get(), byteBuffer2));
                bVar.mo34578m((Integer) mo22176g(byteBuffer.get(), byteBuffer2));
                bVar.mo34549w((String) mo22176g(byteBuffer.get(), byteBuffer2));
                bVar.mo34580o((String) mo22176g(byteBuffer.get(), byteBuffer2));
                bVar.mo34581p(this.f42257f);
                bVar.mo34576k((Map) mo22176g(byteBuffer.get(), byteBuffer2));
                bVar.mo34584s(this.f42258g.mo34476a());
                return bVar.mo34545a();
            case -121:
                String str = (String) mo22176g(byteBuffer.get(), byteBuffer2);
                str.hashCode();
                if (str.equals("ready")) {
                    return C10862o.C10864b.READY;
                }
                if (str.equals("notReady")) {
                    return C10862o.C10864b.NOT_READY;
                }
                throw new IllegalArgumentException(String.format("Unable to handle state: %s", new Object[]{str}));
            case -120:
                return new C10862o((C10862o.C10864b) mo22176g(byteBuffer.get(), byteBuffer2), (String) mo22176g(byteBuffer.get(), byteBuffer2), (Number) mo22176g(byteBuffer.get(), byteBuffer2));
            case -119:
                return new C10870t((Map<String, C10862o>) (Map) mo22176g(byteBuffer.get(), byteBuffer2));
            case -118:
                return new C10835f0((String) mo22176g(byteBuffer.get(), byteBuffer2), (String) mo22176g(byteBuffer.get(), byteBuffer2));
            case -117:
                return new C10826e.C10827a(((Integer) mo22176g(byteBuffer.get(), byteBuffer2)).intValue(), (String) mo22176g(byteBuffer.get(), byteBuffer2), (String) mo22176g(byteBuffer.get(), byteBuffer2));
            case -116:
                return new C10826e.C10831e((String) mo22176g(byteBuffer.get(), byteBuffer2), (String) mo22176g(byteBuffer.get(), byteBuffer2), (List) mo22176g(byteBuffer.get(), byteBuffer2), (C10826e.C10828b) mo22176g(byteBuffer.get(), byteBuffer2), (Map) mo22176g(byteBuffer.get(), byteBuffer2));
            case -115:
                return new C10826e.C10828b((String) mo22176g(byteBuffer.get(), byteBuffer2), ((Long) mo22176g(byteBuffer.get(), byteBuffer2)).longValue(), (String) mo22176g(byteBuffer.get(), byteBuffer2), (Map) mo22176g(byteBuffer.get(), byteBuffer2), (C10826e.C10827a) mo22176g(byteBuffer.get(), byteBuffer2), (String) mo22176g(byteBuffer.get(), byteBuffer2), (String) mo22176g(byteBuffer.get(), byteBuffer2), (String) mo22176g(byteBuffer.get(), byteBuffer2), (String) mo22176g(byteBuffer.get(), byteBuffer2));
            case -114:
                return new C10855m.C10857b(this.f42255d, this.f42256e, (String) mo22176g(byteBuffer.get(), byteBuffer2), ((Integer) mo22176g(byteBuffer.get(), byteBuffer2)).intValue());
            case -113:
                return new C10855m.C10860e();
            case -112:
                return new C10878z((Integer) mo22176g(byteBuffer.get(), byteBuffer2), (Integer) mo22176g(byteBuffer.get(), byteBuffer2), (C10837g0) mo22176g(byteBuffer.get(), byteBuffer2), (Boolean) mo22176g(byteBuffer.get(), byteBuffer2), (Boolean) mo22176g(byteBuffer.get(), byteBuffer2), (Boolean) mo22176g(byteBuffer.get(), byteBuffer2));
            case -111:
                return new C10837g0((Boolean) mo22176g(byteBuffer.get(), byteBuffer2), (Boolean) mo22176g(byteBuffer.get(), byteBuffer2), (Boolean) mo22176g(byteBuffer.get(), byteBuffer2));
            case -110:
                Integer num = (Integer) mo22176g(byteBuffer.get(), byteBuffer2);
                return new C10855m.C10859d(this.f42256e, this.f42255d, ((Integer) mo22176g(byteBuffer.get(), byteBuffer2)).intValue(), num, (Integer) mo22176g(byteBuffer.get(), byteBuffer2));
            case -108:
                C6351u.C6352a aVar = new C6351u.C6352a();
                aVar.mo21722b((String) mo22176g(byteBuffer.get(), byteBuffer2));
                aVar.mo21723c(((Integer) mo22176g(byteBuffer.get(), byteBuffer2)).intValue());
                aVar.mo21724d(((Integer) mo22176g(byteBuffer.get(), byteBuffer2)).intValue());
                aVar.mo21725e((List) mo22176g(byteBuffer.get(), byteBuffer2));
                return aVar.mo21721a();
            default:
                return super.mo22176g(b, byteBuffer);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public void mo22177p(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
        if (obj instanceof C10855m) {
            mo34473t(byteArrayOutputStream, (C10855m) obj);
        } else if (obj instanceof C10843i) {
            byteArrayOutputStream.write(-122);
            C10843i iVar = (C10843i) obj;
            mo22177p(byteArrayOutputStream, iVar.mo34562f());
            mo22177p(byteArrayOutputStream, iVar.mo34560d());
            mo22177p(byteArrayOutputStream, iVar.mo34542l());
            mo22177p(byteArrayOutputStream, iVar.mo34543m());
            mo22177p(byteArrayOutputStream, iVar.mo34565i());
            mo22177p(byteArrayOutputStream, iVar.mo34564h());
            mo22177p(byteArrayOutputStream, iVar.mo34561e());
            mo22177p(byteArrayOutputStream, iVar.mo34544n());
            mo22177p(byteArrayOutputStream, iVar.mo34563g());
            mo22177p(byteArrayOutputStream, iVar.mo34559c());
        } else if (obj instanceof C10853l) {
            byteArrayOutputStream.write(-127);
            C10853l lVar = (C10853l) obj;
            mo22177p(byteArrayOutputStream, lVar.mo34562f());
            mo22177p(byteArrayOutputStream, lVar.mo34560d());
            mo22177p(byteArrayOutputStream, lVar.mo34565i());
            mo22177p(byteArrayOutputStream, lVar.mo34564h());
            mo22177p(byteArrayOutputStream, lVar.mo34561e());
            mo22177p(byteArrayOutputStream, lVar.mo34563g());
            mo22177p(byteArrayOutputStream, lVar.mo34559c());
        } else if (obj instanceof C10823d0.C10825b) {
            byteArrayOutputStream.write(-124);
            C10823d0.C10825b bVar = (C10823d0.C10825b) obj;
            mo22177p(byteArrayOutputStream, bVar.f42274a);
            mo22177p(byteArrayOutputStream, bVar.f42275b);
        } else if (obj instanceof C10826e.C10828b) {
            byteArrayOutputStream.write(-115);
            C10826e.C10828b bVar2 = (C10826e.C10828b) obj;
            mo22177p(byteArrayOutputStream, bVar2.mo34501f());
            mo22177p(byteArrayOutputStream, Long.valueOf(bVar2.mo34505i()));
            mo22177p(byteArrayOutputStream, bVar2.mo34502g());
            mo22177p(byteArrayOutputStream, bVar2.mo34499e());
            mo22177p(byteArrayOutputStream, bVar2.mo34503h());
            mo22177p(byteArrayOutputStream, bVar2.mo34498d());
            mo22177p(byteArrayOutputStream, bVar2.mo34495a());
            mo22177p(byteArrayOutputStream, bVar2.mo34497c());
            mo22177p(byteArrayOutputStream, bVar2.mo34496b());
        } else if (obj instanceof C10826e.C10831e) {
            byteArrayOutputStream.write(-116);
            C10826e.C10831e eVar = (C10826e.C10831e) obj;
            mo22177p(byteArrayOutputStream, eVar.mo34512e());
            mo22177p(byteArrayOutputStream, eVar.mo34510c());
            mo22177p(byteArrayOutputStream, eVar.mo34508a());
            mo22177p(byteArrayOutputStream, eVar.mo34509b());
            mo22177p(byteArrayOutputStream, eVar.mo34511d());
        } else if (obj instanceof C10826e.C10829c) {
            byteArrayOutputStream.write(-123);
            C10826e.C10829c cVar = (C10826e.C10829c) obj;
            mo22177p(byteArrayOutputStream, Integer.valueOf(cVar.f42289a));
            mo22177p(byteArrayOutputStream, cVar.f42290b);
            mo22177p(byteArrayOutputStream, cVar.f42291c);
            mo22177p(byteArrayOutputStream, cVar.f42292d);
        } else if (obj instanceof C10826e.C10827a) {
            byteArrayOutputStream.write(-117);
            C10826e.C10827a aVar = (C10826e.C10827a) obj;
            mo22177p(byteArrayOutputStream, Integer.valueOf(aVar.f42277a));
            mo22177p(byteArrayOutputStream, aVar.f42278b);
            mo22177p(byteArrayOutputStream, aVar.f42279c);
        } else if (obj instanceof C10862o.C10864b) {
            byteArrayOutputStream.write(-121);
            C10862o.C10864b bVar3 = (C10862o.C10864b) obj;
            int i = C10817a.f42259a[bVar3.ordinal()];
            if (i == 1) {
                mo22177p(byteArrayOutputStream, "notReady");
            } else if (i == 2) {
                mo22177p(byteArrayOutputStream, "ready");
            } else {
                throw new IllegalArgumentException(String.format("Unable to handle state: %s", new Object[]{bVar3}));
            }
        } else if (obj instanceof C10862o) {
            byteArrayOutputStream.write(-120);
            C10862o oVar = (C10862o) obj;
            mo22177p(byteArrayOutputStream, oVar.f42373a);
            mo22177p(byteArrayOutputStream, oVar.f42374b);
            mo22177p(byteArrayOutputStream, oVar.f42375c);
        } else if (obj instanceof C10870t) {
            byteArrayOutputStream.write(-119);
            mo22177p(byteArrayOutputStream, ((C10870t) obj).f42397a);
        } else if (obj instanceof C10835f0) {
            byteArrayOutputStream.write(-118);
            C10835f0 f0Var = (C10835f0) obj;
            mo22177p(byteArrayOutputStream, f0Var.mo34524c());
            mo22177p(byteArrayOutputStream, f0Var.mo34523b());
        } else if (obj instanceof C10878z) {
            byteArrayOutputStream.write(-112);
            C10878z zVar = (C10878z) obj;
            mo22177p(byteArrayOutputStream, zVar.f42423a);
            mo22177p(byteArrayOutputStream, zVar.f42424b);
            mo22177p(byteArrayOutputStream, zVar.f42425c);
            mo22177p(byteArrayOutputStream, zVar.f42426d);
            mo22177p(byteArrayOutputStream, zVar.f42427e);
            mo22177p(byteArrayOutputStream, zVar.f42428f);
        } else if (obj instanceof C6351u) {
            byteArrayOutputStream.write(-108);
            C6351u uVar = (C6351u) obj;
            mo22177p(byteArrayOutputStream, uVar.mo21716a());
            mo22177p(byteArrayOutputStream, Integer.valueOf(uVar.mo21717b()));
            mo22177p(byteArrayOutputStream, Integer.valueOf(uVar.mo21718c()));
            mo22177p(byteArrayOutputStream, uVar.mo21719d());
        } else if (obj instanceof C10837g0) {
            byteArrayOutputStream.write(-111);
            C10837g0 g0Var = (C10837g0) obj;
            mo22177p(byteArrayOutputStream, g0Var.f42309a);
            mo22177p(byteArrayOutputStream, g0Var.f42310b);
            mo22177p(byteArrayOutputStream, g0Var.f42311c);
        } else {
            super.mo22177p(byteArrayOutputStream, obj);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public void mo34471r(Context context) {
        this.f42255d = context;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public void mo34472s(C10850j0 j0Var) {
        this.f42257f = j0Var;
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public void mo34473t(ByteArrayOutputStream byteArrayOutputStream, C10855m mVar) {
        if (mVar instanceof C10855m.C10859d) {
            C10855m.C10859d dVar = (C10855m.C10859d) mVar;
            byteArrayOutputStream.write(-110);
            mo22177p(byteArrayOutputStream, Integer.valueOf(dVar.f42365b));
            mo22177p(byteArrayOutputStream, dVar.f42369e);
            mo22177p(byteArrayOutputStream, dVar.f42368d);
        } else if (mVar instanceof C10855m.C10857b) {
            byteArrayOutputStream.write(-114);
            C10855m.C10857b bVar = (C10855m.C10857b) mVar;
            mo22177p(byteArrayOutputStream, bVar.f42367d);
            mo22177p(byteArrayOutputStream, Integer.valueOf(bVar.f42365b));
        } else if (mVar instanceof C10855m.C10860e) {
            byteArrayOutputStream.write(-113);
        } else if (mVar instanceof C10855m.C10858c) {
            byteArrayOutputStream.write(-126);
        } else {
            byteArrayOutputStream.write(-128);
            mo22177p(byteArrayOutputStream, Integer.valueOf(mVar.f42365b));
            mo22177p(byteArrayOutputStream, Integer.valueOf(mVar.f42366c));
        }
    }
}
