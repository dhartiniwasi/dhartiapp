package p217de.mintware.barcode_scan;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.WindowManager;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C11665g;
import kotlin.jvm.internal.C11669k;
import p212d9.C9909a;
import p212d9.C9922n;
import p235fe.C10202a;
import p243gd.C10346p;
import p260ib.C10579e;
import p260ib.C10581f;
import p260ib.C10585g;
import p260ib.C10587h;
import p260ib.C10591k;

/* renamed from: de.mintware.barcode_scan.BarcodeScannerActivity */
/* compiled from: BarcodeScannerActivity.kt */
public final class BarcodeScannerActivity extends Activity implements C10202a.C10204b {

    /* renamed from: c */
    public static final C9952a f39879c = new C9952a((C11665g) null);

    /* renamed from: d */
    private static final Map<C10579e, C9909a> f39880d = C10508b0.m52915g(C10346p.m52247a(C10579e.aztec, C9909a.AZTEC), C10346p.m52247a(C10579e.code39, C9909a.CODE_39), C10346p.m52247a(C10579e.code93, C9909a.CODE_93), C10346p.m52247a(C10579e.code128, C9909a.CODE_128), C10346p.m52247a(C10579e.dataMatrix, C9909a.DATA_MATRIX), C10346p.m52247a(C10579e.ean8, C9909a.EAN_8), C10346p.m52247a(C10579e.ean13, C9909a.EAN_13), C10346p.m52247a(C10579e.interleaved2of5, C9909a.ITF), C10346p.m52247a(C10579e.pdf417, C9909a.PDF_417), C10346p.m52247a(C10579e.qr, C9909a.QR_CODE), C10346p.m52247a(C10579e.upce, C9909a.UPC_E));

    /* renamed from: a */
    private C10581f f39881a;

    /* renamed from: b */
    private C10202a f39882b;

    /* renamed from: de.mintware.barcode_scan.BarcodeScannerActivity$a */
    /* compiled from: BarcodeScannerActivity.kt */
    public static final class C9952a {
        private C9952a() {
        }

        public /* synthetic */ C9952a(C11665g gVar) {
            this();
        }
    }

    public BarcodeScannerActivity() {
        setTitle("");
    }

    /* renamed from: b */
    private final List<C9909a> m50945b() {
        ArrayList arrayList = new ArrayList();
        C10581f fVar = this.f39881a;
        if (fVar == null) {
            C11669k.m56797o("config");
            fVar = null;
        }
        List<C10579e> k0 = fVar.mo33780k0();
        C11669k.m56786d(k0, "this.config.restrictFormatList");
        for (C10579e eVar : C10530r.m52978k(k0)) {
            Map<C10579e, C9909a> map = f39880d;
            if (!map.containsKey(eVar)) {
                System.out.print("Unrecognized");
            } else {
                arrayList.add(C10508b0.m52914f(map, eVar));
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    private final void m50946c() {
        if (this.f39882b == null) {
            C10591k kVar = new C10591k(this);
            C10581f fVar = this.f39881a;
            C10581f fVar2 = null;
            if (fVar == null) {
                C11669k.m56797o("config");
                fVar = null;
            }
            kVar.setAutoFocus(fVar.mo33778h0().mo33774f0());
            List<C9909a> b = m50945b();
            if (!b.isEmpty()) {
                kVar.setFormats(b);
            }
            C10581f fVar3 = this.f39881a;
            if (fVar3 == null) {
                C11669k.m56797o("config");
                fVar3 = null;
            }
            kVar.setAspectTolerance((float) fVar3.mo33778h0().mo33773d0());
            C10581f fVar4 = this.f39881a;
            if (fVar4 == null) {
                C11669k.m56797o("config");
                fVar4 = null;
            }
            if (fVar4.mo33779i0()) {
                C10581f fVar5 = this.f39881a;
                if (fVar5 == null) {
                    C11669k.m56797o("config");
                } else {
                    fVar2 = fVar5;
                }
                kVar.setFlash(fVar2.mo33779i0());
                invalidateOptionsMenu();
            }
            this.f39882b = kVar;
            setContentView(kVar);
        }
    }

    /* renamed from: a */
    public void mo32515a(C9922n nVar) {
        Intent intent = new Intent();
        setRequestedOrientation(-1);
        C10587h.C10588a f0 = C10587h.m53179f0();
        if (nVar == null) {
            f0.mo33789D(C10579e.unknown);
            f0.mo33791F("No data was scanned");
            f0.mo33792G(C10585g.Error);
        } else {
            Map<C10579e, C9909a> map = f39880d;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry next : map.entrySet()) {
                if (((C9909a) next.getValue()) == nVar.mo32472b()) {
                    linkedHashMap.put(next.getKey(), next.getValue());
                }
            }
            C10579e eVar = (C10579e) C10530r.m52980m(linkedHashMap.keySet());
            if (eVar == null) {
                eVar = C10579e.unknown;
            }
            String str = eVar == C10579e.unknown ? nVar.mo32472b().toString() : "";
            f0.mo33789D(eVar);
            f0.mo33790E(str);
            f0.mo33791F(nVar.mo32476f());
            f0.mo33792G(C10585g.Barcode);
        }
        intent.putExtra("scan_result", ((C10587h) f0.build()).mo26773h());
        setResult(-1, intent);
        finish();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Object systemService = getSystemService("window");
        C11669k.m56785c(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        int rotation = ((WindowManager) systemService).getDefaultDisplay().getRotation();
        int i = 1;
        if (rotation != 0) {
            i = rotation != 1 ? rotation != 2 ? 8 : 9 : 0;
        }
        setRequestedOrientation(i);
        Bundle extras = getIntent().getExtras();
        C11669k.m56784b(extras);
        C10581f q0 = C10581f.m53155q0(extras.getByteArray("config"));
        C11669k.m56786d(q0, "parseFrom(intent.extras!…tByteArray(EXTRA_CONFIG))");
        this.f39881a = q0;
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        C11669k.m56787e(menu, "menu");
        C10581f fVar = this.f39881a;
        C10581f fVar2 = null;
        if (fVar == null) {
            C11669k.m56797o("config");
            fVar = null;
        }
        String str = fVar.mo33781l0().get("flash_on");
        C10202a aVar = this.f39882b;
        boolean z = true;
        if (aVar == null || !aVar.getFlash()) {
            z = false;
        }
        if (z) {
            C10581f fVar3 = this.f39881a;
            if (fVar3 == null) {
                C11669k.m56797o("config");
                fVar3 = null;
            }
            str = fVar3.mo33781l0().get("flash_off");
        }
        menu.add(0, 200, 0, str).setShowAsAction(2);
        C10581f fVar4 = this.f39881a;
        if (fVar4 == null) {
            C11669k.m56797o("config");
        } else {
            fVar2 = fVar4;
        }
        menu.add(0, 300, 0, fVar2.mo33781l0().get("cancel")).setShowAsAction(2);
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        C11669k.m56787e(menuItem, "item");
        if (menuItem.getItemId() == 200) {
            C10202a aVar = this.f39882b;
            if (aVar != null) {
                aVar.mo32732i();
            }
            invalidateOptionsMenu();
            return true;
        } else if (menuItem.getItemId() != 300) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            setResult(0);
            finish();
            return true;
        }
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        C10202a aVar = this.f39882b;
        if (aVar != null) {
            aVar.mo32728g();
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        m50946c();
        C10202a aVar = this.f39882b;
        if (aVar != null) {
            aVar.setResultHandler(this);
        }
        C10581f fVar = this.f39881a;
        C10581f fVar2 = null;
        if (fVar == null) {
            C11669k.m56797o("config");
            fVar = null;
        }
        if (fVar.mo33782m0() > -1) {
            C10202a aVar2 = this.f39882b;
            if (aVar2 != null) {
                C10581f fVar3 = this.f39881a;
                if (fVar3 == null) {
                    C11669k.m56797o("config");
                } else {
                    fVar2 = fVar3;
                }
                aVar2.mo32727f(fVar2.mo33782m0());
                return;
            }
            return;
        }
        C10202a aVar3 = this.f39882b;
        if (aVar3 != null) {
            aVar3.mo32726e();
        }
    }
}
