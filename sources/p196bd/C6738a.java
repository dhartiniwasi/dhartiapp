package p196bd;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.graphics.pdf.PdfRenderer;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import android.util.SparseArray;
import android.view.Surface;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import kotlin.jvm.internal.C11669k;
import kotlin.jvm.internal.C11670l;
import p204cd.C6855a;
import p204cd.C6856b;
import p216dd.C9946a;
import p216dd.C9947b;
import p216dd.C9949d;
import p225ed.C10107b;
import p225ed.C10108c;
import p225ed.C10109d;
import p243gd.C10340l;
import p243gd.C10349s;
import p264io.flutter.view.C11091f;
import p270jb.C11517a;
import p344rd.C12439l;
import p351sb.C12502a;

/* renamed from: bd.a */
/* compiled from: Messages.kt */
public final class C6738a implements C11517a.C11524g {

    /* renamed from: a */
    private final C12502a.C12504b f31244a;

    /* renamed from: b */
    private final C9946a f31245b;

    /* renamed from: c */
    private final C9947b f31246c;

    /* renamed from: d */
    private final SparseArray<C11091f.C11094c> f31247d = new SparseArray<>();

    /* renamed from: bd.a$a */
    /* compiled from: Messages.kt */
    static final class C6739a extends C11670l implements C12439l<Surface, C10349s> {

        /* renamed from: a */
        final /* synthetic */ int f31248a;

        /* renamed from: b */
        final /* synthetic */ int f31249b;

        /* renamed from: c */
        final /* synthetic */ int f31250c;

        /* renamed from: d */
        final /* synthetic */ int f31251d;

        /* renamed from: e */
        final /* synthetic */ Bitmap f31252e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C6739a(int i, int i2, int i3, int i4, Bitmap bitmap) {
            super(1);
            this.f31248a = i;
            this.f31249b = i2;
            this.f31250c = i3;
            this.f31251d = i4;
            this.f31252e = bitmap;
        }

        /* renamed from: a */
        public final void mo22666a(Surface surface) {
            C11669k.m56787e(surface, "it");
            Canvas lockCanvas = surface.lockCanvas(new Rect(this.f31248a, this.f31249b, this.f31250c, this.f31251d));
            lockCanvas.drawBitmap(this.f31252e, (float) this.f31248a, (float) this.f31249b, (Paint) null);
            this.f31252e.recycle();
            surface.unlockCanvasAndPost(lockCanvas);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo22666a((Surface) obj);
            return C10349s.f40964a;
        }
    }

    public C6738a(C12502a.C12504b bVar, C9946a aVar, C9947b bVar2) {
        C11669k.m56787e(bVar, "binding");
        C11669k.m56787e(aVar, "documents");
        C11669k.m56787e(bVar2, "pages");
        this.f31244a = bVar;
        this.f31245b = aVar;
        this.f31246c = bVar2;
    }

    /* renamed from: l */
    private final C10340l<ParcelFileDescriptor, PdfRenderer> m38638l(String str) {
        String a = this.f31244a.mo37294c().mo34110a(str);
        File cacheDir = this.f31244a.mo37292a().getCacheDir();
        File file = new File(cacheDir, C10109d.m51423a() + ".pdf");
        if (!file.exists()) {
            InputStream open = this.f31244a.mo37292a().getAssets().open(a);
            C11669k.m56786d(open, "binding.applicationConte…ssets.open(fullAssetPath)");
            C10108c.m51422b(open, file);
            open.close();
        }
        Log.d("pdf_renderer", "OpenAssetDocument. Created file: " + file.getPath());
        return m38640n(file);
    }

    /* renamed from: m */
    private final C10340l<ParcelFileDescriptor, PdfRenderer> m38639m(byte[] bArr) {
        File cacheDir = this.f31244a.mo37292a().getCacheDir();
        File file = new File(cacheDir, C10109d.m51423a() + ".pdf");
        if (!file.exists()) {
            C12117e.m58235a(file, bArr);
        }
        Log.d("pdf_renderer", "OpenDataDocument. Created file: " + file.getPath());
        return m38640n(file);
    }

    /* renamed from: n */
    private final C10340l<ParcelFileDescriptor, PdfRenderer> m38640n(File file) {
        Log.d("pdf_renderer", "OpenFileDocument. File: " + file.getPath());
        ParcelFileDescriptor open = ParcelFileDescriptor.open(file, 268435456);
        if (open != null) {
            return new C10340l<>(open, new PdfRenderer(open));
        }
        throw new C10107b();
    }

    /* renamed from: a */
    public void mo22655a(C11517a.C11531n nVar) {
        C11669k.m56787e(nVar, "message");
        Long b = nVar.mo35605b();
        C11669k.m56784b(b);
        int longValue = (int) b.longValue();
        C11091f.C11094c cVar = this.f31247d.get(longValue);
        if (cVar != null) {
            cVar.mo34883a();
        }
        this.f31247d.remove(longValue);
    }

    /* renamed from: b */
    public void mo22656b(C11517a.C11520c cVar) {
        C11669k.m56787e(cVar, "message");
        try {
            String b = cVar.mo35550b();
            C11669k.m56784b(b);
            this.f31246c.mo32509b(b);
        } catch (NullPointerException unused) {
            throw new C6741c("pdf_renderer", "Need call arguments: id!", (Object) null);
        } catch (C9949d unused2) {
            throw new C6741c("pdf_renderer", "Page not exist in pages repository", (Object) null);
        } catch (Exception unused3) {
            throw new C6741c("pdf_renderer", "Unknown error", (Object) null);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x005e, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        p326pd.C12174a.m58460a(r7, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0062, code lost:
        throw r3;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo22657c(p270jb.C11517a.C11518a r7, p270jb.C11517a.C11530m<p270jb.C11517a.C11519b> r8) {
        /*
            r6 = this;
            java.lang.String r0 = "pdf_renderer"
            java.lang.String r1 = "message"
            kotlin.jvm.internal.C11669k.m56787e(r7, r1)
            java.lang.String r1 = "result"
            kotlin.jvm.internal.C11669k.m56787e(r8, r1)
            jb.a$b r1 = new jb.a$b
            r1.<init>()
            r2 = 0
            java.lang.String r3 = r7.mo35540c()     // Catch:{ NullPointerException -> 0x00ae, d -> 0x00a3, Exception -> 0x0098 }
            kotlin.jvm.internal.C11669k.m56784b(r3)     // Catch:{ NullPointerException -> 0x00ae, d -> 0x00a3, Exception -> 0x0098 }
            java.lang.Long r4 = r7.mo35541d()     // Catch:{ NullPointerException -> 0x00ae, d -> 0x00a3, Exception -> 0x0098 }
            kotlin.jvm.internal.C11669k.m56784b(r4)     // Catch:{ NullPointerException -> 0x00ae, d -> 0x00a3, Exception -> 0x0098 }
            long r4 = r4.longValue()     // Catch:{ NullPointerException -> 0x00ae, d -> 0x00a3, Exception -> 0x0098 }
            int r5 = (int) r4     // Catch:{ NullPointerException -> 0x00ae, d -> 0x00a3, Exception -> 0x0098 }
            java.lang.Boolean r7 = r7.mo35539b()     // Catch:{ NullPointerException -> 0x00ae, d -> 0x00a3, Exception -> 0x0098 }
            kotlin.jvm.internal.C11669k.m56784b(r7)     // Catch:{ NullPointerException -> 0x00ae, d -> 0x00a3, Exception -> 0x0098 }
            boolean r7 = r7.booleanValue()     // Catch:{ NullPointerException -> 0x00ae, d -> 0x00a3, Exception -> 0x0098 }
            if (r7 == 0) goto L_0x0063
            dd.a r7 = r6.f31245b     // Catch:{ NullPointerException -> 0x00ae, d -> 0x00a3, Exception -> 0x0098 }
            java.lang.Object r7 = r7.mo32513d(r3)     // Catch:{ NullPointerException -> 0x00ae, d -> 0x00a3, Exception -> 0x0098 }
            cd.a r7 = (p204cd.C6855a) r7     // Catch:{ NullPointerException -> 0x00ae, d -> 0x00a3, Exception -> 0x0098 }
            android.graphics.pdf.PdfRenderer$Page r7 = r7.mo22965d(r5)     // Catch:{ NullPointerException -> 0x00ae, d -> 0x00a3, Exception -> 0x0098 }
            int r3 = r7.getWidth()     // Catch:{ all -> 0x005c }
            double r3 = (double) r3     // Catch:{ all -> 0x005c }
            java.lang.Double r3 = java.lang.Double.valueOf(r3)     // Catch:{ all -> 0x005c }
            r1.mo35548d(r3)     // Catch:{ all -> 0x005c }
            int r3 = r7.getHeight()     // Catch:{ all -> 0x005c }
            double r3 = (double) r3     // Catch:{ all -> 0x005c }
            java.lang.Double r3 = java.lang.Double.valueOf(r3)     // Catch:{ all -> 0x005c }
            r1.mo35546b(r3)     // Catch:{ all -> 0x005c }
            gd.s r3 = p243gd.C10349s.f40964a     // Catch:{ all -> 0x005c }
            p326pd.C12174a.m58460a(r7, r2)     // Catch:{ NullPointerException -> 0x00ae, d -> 0x00a3, Exception -> 0x0098 }
            goto L_0x0094
        L_0x005c:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x005e }
        L_0x005e:
            r3 = move-exception
            p326pd.C12174a.m58460a(r7, r1)     // Catch:{ NullPointerException -> 0x00ae, d -> 0x00a3, Exception -> 0x0098 }
            throw r3     // Catch:{ NullPointerException -> 0x00ae, d -> 0x00a3, Exception -> 0x0098 }
        L_0x0063:
            dd.a r7 = r6.f31245b     // Catch:{ NullPointerException -> 0x00ae, d -> 0x00a3, Exception -> 0x0098 }
            java.lang.Object r7 = r7.mo32513d(r3)     // Catch:{ NullPointerException -> 0x00ae, d -> 0x00a3, Exception -> 0x0098 }
            cd.a r7 = (p204cd.C6855a) r7     // Catch:{ NullPointerException -> 0x00ae, d -> 0x00a3, Exception -> 0x0098 }
            android.graphics.pdf.PdfRenderer$Page r7 = r7.mo22965d(r5)     // Catch:{ NullPointerException -> 0x00ae, d -> 0x00a3, Exception -> 0x0098 }
            dd.b r4 = r6.f31246c     // Catch:{ NullPointerException -> 0x00ae, d -> 0x00a3, Exception -> 0x0098 }
            cd.b r7 = r4.mo32511f(r3, r7)     // Catch:{ NullPointerException -> 0x00ae, d -> 0x00a3, Exception -> 0x0098 }
            java.lang.String r3 = r7.mo22968c()     // Catch:{ NullPointerException -> 0x00ae, d -> 0x00a3, Exception -> 0x0098 }
            r1.mo35547c(r3)     // Catch:{ NullPointerException -> 0x00ae, d -> 0x00a3, Exception -> 0x0098 }
            int r3 = r7.mo22969d()     // Catch:{ NullPointerException -> 0x00ae, d -> 0x00a3, Exception -> 0x0098 }
            double r3 = (double) r3     // Catch:{ NullPointerException -> 0x00ae, d -> 0x00a3, Exception -> 0x0098 }
            java.lang.Double r3 = java.lang.Double.valueOf(r3)     // Catch:{ NullPointerException -> 0x00ae, d -> 0x00a3, Exception -> 0x0098 }
            r1.mo35548d(r3)     // Catch:{ NullPointerException -> 0x00ae, d -> 0x00a3, Exception -> 0x0098 }
            int r7 = r7.mo22967b()     // Catch:{ NullPointerException -> 0x00ae, d -> 0x00a3, Exception -> 0x0098 }
            double r3 = (double) r7     // Catch:{ NullPointerException -> 0x00ae, d -> 0x00a3, Exception -> 0x0098 }
            java.lang.Double r7 = java.lang.Double.valueOf(r3)     // Catch:{ NullPointerException -> 0x00ae, d -> 0x00a3, Exception -> 0x0098 }
            r1.mo35546b(r7)     // Catch:{ NullPointerException -> 0x00ae, d -> 0x00a3, Exception -> 0x0098 }
        L_0x0094:
            r8.success(r1)     // Catch:{ NullPointerException -> 0x00ae, d -> 0x00a3, Exception -> 0x0098 }
            goto L_0x00b8
        L_0x0098:
            bd.c r7 = new bd.c
            java.lang.String r1 = "Unknown error"
            r7.<init>(r0, r1, r2)
            r8.mo35603a(r7)
            goto L_0x00b8
        L_0x00a3:
            bd.c r7 = new bd.c
            java.lang.String r1 = "Document not exist in documents"
            r7.<init>(r0, r1, r2)
            r8.mo35603a(r7)
            goto L_0x00b8
        L_0x00ae:
            bd.c r7 = new bd.c
            java.lang.String r1 = "Need call arguments: documentId & page!"
            r7.<init>(r0, r1, r2)
            r8.mo35603a(r7)
        L_0x00b8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p196bd.C6738a.mo22657c(jb.a$a, jb.a$m):void");
    }

    /* renamed from: d */
    public void mo22658d(C11517a.C11521d dVar, C11517a.C11530m<C11517a.C11523f> mVar) {
        C11669k.m56787e(dVar, "message");
        C11669k.m56787e(mVar, "result");
        C11517a.C11523f fVar = new C11517a.C11523f();
        try {
            byte[] b = dVar.mo35553b();
            C11669k.m56784b(b);
            C6855a f = this.f31245b.mo32510f(m38639m(b));
            fVar.mo35561b(f.mo22963b());
            fVar.mo35562c(Long.valueOf((long) f.mo22964c()));
            mVar.success(fVar);
        } catch (IOException unused) {
            mVar.mo35603a(new C6741c("pdf_renderer", "Can't open file", (Object) null));
        } catch (C10107b unused2) {
            mVar.mo35603a(new C6741c("pdf_renderer", "Can't create PDF renderer", (Object) null));
        } catch (Exception unused3) {
            mVar.mo35603a(new C6741c("pdf_renderer", "Unknown error", (Object) null));
        }
    }

    /* renamed from: e */
    public void mo22659e(C11517a.C11527j jVar, C11517a.C11530m<C11517a.C11528k> mVar) {
        int i;
        int i2;
        int i3;
        int i4;
        C11517a.C11530m<C11517a.C11528k> mVar2 = mVar;
        C11669k.m56787e(jVar, "message");
        C11669k.m56787e(mVar2, "result");
        C11517a.C11528k kVar = new C11517a.C11528k();
        try {
            String k = jVar.mo35575k();
            C11669k.m56784b(k);
            Long m = jVar.mo35577m();
            C11669k.m56784b(m);
            int longValue = (int) m.longValue();
            Long j = jVar.mo35574j();
            C11669k.m56784b(j);
            int longValue2 = (int) j.longValue();
            Long i5 = jVar.mo35573i();
            int longValue3 = i5 != null ? (int) i5.longValue() : 1;
            Boolean h = jVar.mo35572h();
            if (h == null) {
                h = Boolean.FALSE;
            }
            boolean booleanValue = h.booleanValue();
            String b = jVar.mo35566b();
            int parseColor = b != null ? Color.parseColor(b) : 0;
            Boolean c = jVar.mo35567c();
            C11669k.m56784b(c);
            boolean booleanValue2 = c.booleanValue();
            if (booleanValue2) {
                Long f = jVar.mo35570f();
                C11669k.m56784b(f);
                i = (int) f.longValue();
            } else {
                i = 0;
            }
            if (booleanValue2) {
                Long g = jVar.mo35571g();
                C11669k.m56784b(g);
                i2 = (int) g.longValue();
            } else {
                i2 = 0;
            }
            if (booleanValue2) {
                Long d = jVar.mo35568d();
                C11669k.m56784b(d);
                i3 = (int) d.longValue();
            } else {
                i3 = 0;
            }
            if (booleanValue2) {
                Long e = jVar.mo35569e();
                C11669k.m56784b(e);
                i4 = (int) e.longValue();
            } else {
                i4 = 0;
            }
            Long l = jVar.mo35576l();
            int longValue4 = l != null ? (int) l.longValue() : 100;
            C6856b bVar = (C6856b) this.f31246c.mo32513d(k);
            String str = "jpg";
            if (longValue3 != 0) {
                if (longValue3 == 1) {
                    str = "png";
                } else if (longValue3 == 2) {
                    str = "webp";
                }
            }
            File file = new File(this.f31244a.mo37292a().getCacheDir(), "pdf_renderer_cache");
            file.mkdirs();
            C6856b.C6857a e2 = bVar.mo22970e(new File(file, C10109d.m51423a() + '.' + str), longValue, longValue2, parseColor, longValue3, booleanValue2, i, i2, i4, i3, longValue4, booleanValue);
            kVar.mo35593d(e2.mo22972b());
            kVar.mo35594e(Long.valueOf((long) e2.mo22973c()));
            kVar.mo35592c(Long.valueOf((long) e2.mo22971a()));
            mVar2.success(kVar);
        } catch (Exception e3) {
            mVar2.mo35603a(new C6741c("pdf_renderer", "Unexpected error", e3));
        }
    }

    /* renamed from: f */
    public void mo22660f(C11517a.C11520c cVar) {
        C11669k.m56787e(cVar, "message");
        try {
            String b = cVar.mo35550b();
            C9946a aVar = this.f31245b;
            C11669k.m56784b(b);
            aVar.mo32509b(b);
        } catch (NullPointerException unused) {
            throw new C6741c("pdf_renderer", "Need call arguments: id!", (Object) null);
        } catch (C9949d unused2) {
            throw new C6741c("pdf_renderer", "Document not exist in documents repository", (Object) null);
        } catch (Exception unused3) {
            throw new C6741c("pdf_renderer", "Unknown error", (Object) null);
        }
    }

    /* renamed from: g */
    public void mo22661g(C11517a.C11522e eVar, C11517a.C11530m<C11517a.C11523f> mVar) {
        C11669k.m56787e(eVar, "message");
        C11669k.m56787e(mVar, "result");
        C11517a.C11523f fVar = new C11517a.C11523f();
        try {
            String b = eVar.mo35557b();
            C11669k.m56784b(b);
            C6855a f = this.f31245b.mo32510f(m38638l(b));
            fVar.mo35561b(f.mo22963b());
            fVar.mo35562c(Long.valueOf((long) f.mo22964c()));
            mVar.success(fVar);
        } catch (NullPointerException unused) {
            mVar.mo35603a(new C6741c("pdf_renderer", "Need call arguments: path", (Object) null));
        } catch (FileNotFoundException unused2) {
            mVar.mo35603a(new C6741c("pdf_renderer", "File not found", (Object) null));
        } catch (IOException unused3) {
            mVar.mo35603a(new C6741c("pdf_renderer", "Can't open file", (Object) null));
        } catch (C10107b unused4) {
            mVar.mo35603a(new C6741c("pdf_renderer", "Can't create PDF renderer", (Object) null));
        } catch (Exception unused5) {
            mVar.mo35603a(new C6741c("pdf_renderer", "Unknown error", (Object) null));
        }
    }

    /* renamed from: h */
    public void mo22662h(C11517a.C11522e eVar, C11517a.C11530m<C11517a.C11523f> mVar) {
        C11669k.m56787e(eVar, "message");
        C11669k.m56787e(mVar, "result");
        C11517a.C11523f fVar = new C11517a.C11523f();
        try {
            String b = eVar.mo35557b();
            C11669k.m56784b(b);
            C6855a f = this.f31245b.mo32510f(m38640n(new File(b)));
            fVar.mo35561b(f.mo22963b());
            fVar.mo35562c(Long.valueOf((long) f.mo22964c()));
            mVar.success(fVar);
        } catch (NullPointerException unused) {
            mVar.mo35603a(new C6741c("pdf_renderer", "Need call arguments: path", (Object) null));
        } catch (FileNotFoundException unused2) {
            mVar.mo35603a(new C6741c("pdf_renderer", "File not found", (Object) null));
        } catch (IOException unused3) {
            mVar.mo35603a(new C6741c("pdf_renderer", "Can't open file", (Object) null));
        } catch (C10107b unused4) {
            mVar.mo35603a(new C6741c("pdf_renderer", "Can't create PDF renderer", (Object) null));
        } catch (Exception unused5) {
            mVar.mo35603a(new C6741c("pdf_renderer", "Unknown error", (Object) null));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        r3 = null;
        r0.mo35603a(new p196bd.C6741c(r5, "updateTexture Unknown error", (java.lang.Object) null));
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x016f */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo22663i(p270jb.C11517a.C11532o r20, p270jb.C11517a.C11530m<java.lang.Void> r21) {
        /*
            r19 = this;
            r1 = r19
            r0 = r21
            java.lang.String r2 = "message"
            r3 = r20
            kotlin.jvm.internal.C11669k.m56787e(r3, r2)
            java.lang.String r2 = "result"
            kotlin.jvm.internal.C11669k.m56787e(r0, r2)
            java.lang.Long r2 = r20.mo35625m()
            kotlin.jvm.internal.C11669k.m56784b(r2)
            long r4 = r2.longValue()
            int r2 = (int) r4
            java.lang.Long r4 = r20.mo35621i()
            kotlin.jvm.internal.C11669k.m56784b(r4)
            long r4 = r4.longValue()
            int r5 = (int) r4
            android.util.SparseArray<io.flutter.view.f$c> r4 = r1.f31247d
            java.lang.Object r2 = r4.get(r2)
            io.flutter.view.f$c r2 = (p264io.flutter.view.C11091f.C11094c) r2
            dd.a r4 = r1.f31245b
            java.lang.String r6 = r20.mo35617e()
            kotlin.jvm.internal.C11669k.m56784b(r6)
            java.lang.Object r4 = r4.mo32513d(r6)
            cd.a r4 = (p204cd.C6855a) r4
            android.graphics.pdf.PdfRenderer$Page r4 = r4.mo22965d(r5)
            java.lang.Double r5 = r20.mo35619g()     // Catch:{ all -> 0x0180 }
            if (r5 != 0) goto L_0x0052
            int r5 = r4.getWidth()     // Catch:{ all -> 0x0180 }
            double r5 = (double) r5     // Catch:{ all -> 0x0180 }
            java.lang.Double r5 = java.lang.Double.valueOf(r5)     // Catch:{ all -> 0x0180 }
        L_0x0052:
            java.lang.String r6 = "message.fullWidth ?: page.width.toDouble()"
            kotlin.jvm.internal.C11669k.m56786d(r5, r6)     // Catch:{ all -> 0x0180 }
            double r5 = r5.doubleValue()     // Catch:{ all -> 0x0180 }
            java.lang.Double r7 = r20.mo35618f()     // Catch:{ all -> 0x0180 }
            if (r7 != 0) goto L_0x006a
            int r7 = r4.getHeight()     // Catch:{ all -> 0x0180 }
            double r7 = (double) r7     // Catch:{ all -> 0x0180 }
            java.lang.Double r7 = java.lang.Double.valueOf(r7)     // Catch:{ all -> 0x0180 }
        L_0x006a:
            java.lang.String r8 = "message.fullHeight ?: page.height.toDouble()"
            kotlin.jvm.internal.C11669k.m56786d(r7, r8)     // Catch:{ all -> 0x0180 }
            double r7 = r7.doubleValue()     // Catch:{ all -> 0x0180 }
            java.lang.Long r9 = r20.mo35615c()     // Catch:{ all -> 0x0180 }
            kotlin.jvm.internal.C11669k.m56784b(r9)     // Catch:{ all -> 0x0180 }
            long r9 = r9.longValue()     // Catch:{ all -> 0x0180 }
            int r12 = (int) r9     // Catch:{ all -> 0x0180 }
            java.lang.Long r9 = r20.mo35616d()     // Catch:{ all -> 0x0180 }
            kotlin.jvm.internal.C11669k.m56784b(r9)     // Catch:{ all -> 0x0180 }
            long r9 = r9.longValue()     // Catch:{ all -> 0x0180 }
            int r13 = (int) r9     // Catch:{ all -> 0x0180 }
            java.lang.Long r9 = r20.mo35627o()     // Catch:{ all -> 0x0180 }
            kotlin.jvm.internal.C11669k.m56784b(r9)     // Catch:{ all -> 0x0180 }
            long r9 = r9.longValue()     // Catch:{ all -> 0x0180 }
            int r14 = (int) r9     // Catch:{ all -> 0x0180 }
            java.lang.Long r9 = r20.mo35620h()     // Catch:{ all -> 0x0180 }
            kotlin.jvm.internal.C11669k.m56784b(r9)     // Catch:{ all -> 0x0180 }
            long r9 = r9.longValue()     // Catch:{ all -> 0x0180 }
            int r15 = (int) r9     // Catch:{ all -> 0x0180 }
            java.lang.Long r9 = r20.mo35622j()     // Catch:{ all -> 0x0180 }
            kotlin.jvm.internal.C11669k.m56784b(r9)     // Catch:{ all -> 0x0180 }
            long r9 = r9.longValue()     // Catch:{ all -> 0x0180 }
            int r10 = (int) r9     // Catch:{ all -> 0x0180 }
            java.lang.Long r9 = r20.mo35623k()     // Catch:{ all -> 0x0180 }
            kotlin.jvm.internal.C11669k.m56784b(r9)     // Catch:{ all -> 0x0180 }
            r16 = r12
            long r11 = r9.longValue()     // Catch:{ all -> 0x0180 }
            int r9 = (int) r11     // Catch:{ all -> 0x0180 }
            java.lang.String r11 = r20.mo35614b()     // Catch:{ all -> 0x0180 }
            java.lang.String r12 = "pdf_renderer"
            if (r14 <= 0) goto L_0x00cb
            if (r15 > 0) goto L_0x00c8
            goto L_0x00cb
        L_0x00c8:
            r17 = r13
            goto L_0x00d8
        L_0x00cb:
            bd.c r1 = new bd.c     // Catch:{ all -> 0x0180 }
            java.lang.String r3 = "updateTexture width/height == 0"
            r17 = r13
            r13 = 0
            r1.<init>(r12, r3, r13)     // Catch:{ all -> 0x0180 }
            r0.mo35603a(r1)     // Catch:{ all -> 0x0180 }
        L_0x00d8:
            android.graphics.Matrix r1 = new android.graphics.Matrix     // Catch:{ all -> 0x0180 }
            r1.<init>()     // Catch:{ all -> 0x0180 }
            r3 = 9
            float[] r3 = new float[r3]     // Catch:{ all -> 0x0180 }
            int r13 = r4.getWidth()     // Catch:{ all -> 0x0180 }
            r18 = r12
            double r12 = (double) r13     // Catch:{ all -> 0x0180 }
            double r5 = r5 / r12
            float r5 = (float) r5     // Catch:{ all -> 0x0180 }
            r6 = 0
            r3[r6] = r5     // Catch:{ all -> 0x0180 }
            r5 = 1
            r6 = 0
            r3[r5] = r6     // Catch:{ all -> 0x0180 }
            r12 = 2
            float r10 = (float) r10     // Catch:{ all -> 0x0180 }
            float r10 = -r10
            r3[r12] = r10     // Catch:{ all -> 0x0180 }
            r10 = 3
            r3[r10] = r6     // Catch:{ all -> 0x0180 }
            r10 = 4
            int r12 = r4.getHeight()     // Catch:{ all -> 0x0180 }
            double r12 = (double) r12     // Catch:{ all -> 0x0180 }
            double r7 = r7 / r12
            float r7 = (float) r7     // Catch:{ all -> 0x0180 }
            r3[r10] = r7     // Catch:{ all -> 0x0180 }
            r7 = 5
            float r8 = (float) r9     // Catch:{ all -> 0x0180 }
            float r8 = -r8
            r3[r7] = r8     // Catch:{ all -> 0x0180 }
            r7 = 6
            r3[r7] = r6     // Catch:{ all -> 0x0180 }
            r7 = 7
            r3[r7] = r6     // Catch:{ all -> 0x0180 }
            r6 = 8
            r7 = 1065353216(0x3f800000, float:1.0)
            r3[r6] = r7     // Catch:{ all -> 0x0180 }
            r1.setValues(r3)     // Catch:{ all -> 0x0180 }
            android.graphics.Bitmap$Config r3 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ Exception -> 0x016d }
            android.graphics.Bitmap r3 = android.graphics.Bitmap.createBitmap(r14, r15, r3)     // Catch:{ Exception -> 0x016d }
            if (r11 == 0) goto L_0x0126
            int r6 = android.graphics.Color.parseColor(r11)     // Catch:{ Exception -> 0x016d }
            r3.eraseColor(r6)     // Catch:{ Exception -> 0x016d }
        L_0x0126:
            r6 = 0
            r4.render(r3, r6, r1, r5)     // Catch:{ Exception -> 0x016d }
            java.lang.Long r1 = r20.mo35626n()     // Catch:{ Exception -> 0x016d }
            kotlin.jvm.internal.C11669k.m56784b(r1)     // Catch:{ Exception -> 0x016d }
            long r5 = r1.longValue()     // Catch:{ Exception -> 0x016d }
            int r1 = (int) r5     // Catch:{ Exception -> 0x016d }
            java.lang.Long r5 = r20.mo35624l()     // Catch:{ Exception -> 0x016d }
            kotlin.jvm.internal.C11669k.m56784b(r5)     // Catch:{ Exception -> 0x016d }
            long r5 = r5.longValue()     // Catch:{ Exception -> 0x016d }
            int r6 = (int) r5     // Catch:{ Exception -> 0x016d }
            if (r1 == 0) goto L_0x014d
            if (r6 == 0) goto L_0x014d
            android.graphics.SurfaceTexture r5 = r2.mo34885c()     // Catch:{ Exception -> 0x016d }
            r5.setDefaultBufferSize(r1, r6)     // Catch:{ Exception -> 0x016d }
        L_0x014d:
            android.view.Surface r1 = new android.view.Surface     // Catch:{ Exception -> 0x016d }
            android.graphics.SurfaceTexture r2 = r2.mo34885c()     // Catch:{ Exception -> 0x016d }
            r1.<init>(r2)     // Catch:{ Exception -> 0x016d }
            bd.a$a r2 = new bd.a$a     // Catch:{ Exception -> 0x016d }
            r11 = r2
            r5 = r18
            r12 = r16
            r13 = r17
            r16 = r3
            r11.<init>(r12, r13, r14, r15, r16)     // Catch:{ Exception -> 0x016f }
            p196bd.C6740b.m38653a(r1, r2)     // Catch:{ Exception -> 0x016f }
            r1 = 0
            r0.success(r1)     // Catch:{ Exception -> 0x016f }
            r3 = 0
            goto L_0x017a
        L_0x016d:
            r5 = r18
        L_0x016f:
            bd.c r1 = new bd.c     // Catch:{ all -> 0x0180 }
            java.lang.String r2 = "updateTexture Unknown error"
            r3 = 0
            r1.<init>(r5, r2, r3)     // Catch:{ all -> 0x0180 }
            r0.mo35603a(r1)     // Catch:{ all -> 0x0180 }
        L_0x017a:
            gd.s r0 = p243gd.C10349s.f40964a     // Catch:{ all -> 0x0180 }
            p326pd.C12174a.m58460a(r4, r3)
            return
        L_0x0180:
            r0 = move-exception
            r1 = r0
            throw r1     // Catch:{ all -> 0x0183 }
        L_0x0183:
            r0 = move-exception
            r2 = r0
            p326pd.C12174a.m58460a(r4, r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p196bd.C6738a.mo22663i(jb.a$o, jb.a$m):void");
    }

    /* renamed from: j */
    public C11517a.C11526i mo22664j() {
        C11091f.C11094c h = this.f31244a.mo37297f().mo34869h();
        C11669k.m56786d(h, "binding.textureRegistry.createSurfaceTexture()");
        int d = (int) h.mo34886d();
        this.f31247d.put(d, h);
        C11517a.C11526i iVar = new C11517a.C11526i();
        iVar.mo35564b(Long.valueOf((long) d));
        return iVar;
    }

    /* renamed from: k */
    public void mo22665k(C11517a.C11529l lVar, C11517a.C11530m<Void> mVar) {
        SurfaceTexture c;
        C11669k.m56787e(lVar, "message");
        C11669k.m56787e(mVar, "result");
        Long c2 = lVar.mo35597c();
        C11669k.m56784b(c2);
        int longValue = (int) c2.longValue();
        Long d = lVar.mo35598d();
        C11669k.m56784b(d);
        int longValue2 = (int) d.longValue();
        Long b = lVar.mo35596b();
        C11669k.m56784b(b);
        int longValue3 = (int) b.longValue();
        C11091f.C11094c cVar = this.f31247d.get(longValue);
        if (!(cVar == null || (c = cVar.mo34885c()) == null)) {
            c.setDefaultBufferSize(longValue2, longValue3);
        }
        mVar.success(null);
    }
}
