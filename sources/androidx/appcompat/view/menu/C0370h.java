package androidx.appcompat.view.menu;

import android.content.DialogInterface;
import android.os.IBinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.appcompat.app.C0280c;
import androidx.appcompat.view.menu.C0383m;
import p048g.C4294g;

/* renamed from: androidx.appcompat.view.menu.h */
/* compiled from: MenuDialogHelper */
class C0370h implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, C0383m.C0384a {

    /* renamed from: a */
    private C0367g f1146a;

    /* renamed from: b */
    private C0280c f1147b;

    /* renamed from: c */
    C0364e f1148c;

    /* renamed from: d */
    private C0383m.C0384a f1149d;

    public C0370h(C0367g gVar) {
        this.f1146a = gVar;
    }

    /* renamed from: a */
    public void mo996a(C0367g gVar, boolean z) {
        if (z || gVar == this.f1146a) {
            mo1408c();
        }
        C0383m.C0384a aVar = this.f1149d;
        if (aVar != null) {
            aVar.mo996a(gVar, z);
        }
    }

    /* renamed from: b */
    public boolean mo997b(C0367g gVar) {
        C0383m.C0384a aVar = this.f1149d;
        if (aVar != null) {
            return aVar.mo997b(gVar);
        }
        return false;
    }

    /* renamed from: c */
    public void mo1408c() {
        C0280c cVar = this.f1147b;
        if (cVar != null) {
            cVar.dismiss();
        }
    }

    /* renamed from: d */
    public void mo1409d(IBinder iBinder) {
        C0367g gVar = this.f1146a;
        C0280c.C0281a aVar = new C0280c.C0281a(gVar.mo1402u());
        C0364e eVar = new C0364e(aVar.mo874b(), C4294g.f23907j);
        this.f1148c = eVar;
        eVar.mo1276g(this);
        this.f1146a.mo1368b(this.f1148c);
        aVar.mo875c(this.f1148c.mo1315b(), this);
        View y = gVar.mo1406y();
        if (y != null) {
            aVar.mo876d(y);
        } else {
            aVar.mo877e(gVar.mo1404w()).mo886n(gVar.mo1405x());
        }
        aVar.mo882j(this);
        C0280c a = aVar.mo873a();
        this.f1147b = a;
        a.setOnDismissListener(this);
        WindowManager.LayoutParams attributes = this.f1147b.getWindow().getAttributes();
        attributes.type = 1003;
        if (iBinder != null) {
            attributes.token = iBinder;
        }
        attributes.flags |= 131072;
        this.f1147b.show();
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.f1146a.mo1344L((C0371i) this.f1148c.mo1315b().getItem(i), 0);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        this.f1148c.mo1271a(this.f1146a, true);
    }

    public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f1147b.getWindow();
                if (!(window2 == null || (decorView2 = window2.getDecorView()) == null || (keyDispatcherState2 = decorView2.getKeyDispatcherState()) == null)) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f1147b.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.f1146a.mo1376e(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.f1146a.performShortcut(i, keyEvent, 0);
    }
}
