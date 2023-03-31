package p203cc;

import android.view.PointerIcon;
import com.facebook.ads.AdError;
import java.util.HashMap;
import p417zb.C13505g;

/* renamed from: cc.a */
/* compiled from: MouseCursorPlugin */
public class C6851a {

    /* renamed from: c */
    private static HashMap<String, Integer> f31512c;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C6854c f31513a;

    /* renamed from: b */
    private final C13505g f31514b;

    /* renamed from: cc.a$a */
    /* compiled from: MouseCursorPlugin */
    class C6852a implements C13505g.C13507b {
        C6852a() {
        }

        /* renamed from: a */
        public void mo22959a(String str) {
            C6851a.this.f31513a.setPointerIcon(C6851a.this.m39422d(str));
        }
    }

    /* renamed from: cc.a$b */
    /* compiled from: MouseCursorPlugin */
    class C6853b extends HashMap<String, Integer> {
        C6853b() {
            put("alias", 1010);
            put("allScroll", 1013);
            put("basic", Integer.valueOf(AdError.NETWORK_ERROR_CODE));
            put("cell", 1006);
            put("click", Integer.valueOf(AdError.LOAD_TOO_FREQUENTLY_ERROR_CODE));
            put("contextMenu", Integer.valueOf(AdError.NO_FILL_ERROR_CODE));
            put("copy", 1011);
            put("forbidden", 1012);
            put("grab", 1020);
            put("grabbing", 1021);
            put("help", 1003);
            put("move", 1013);
            put("none", 0);
            put("noDrop", 1012);
            put("precise", 1007);
            put("text", 1008);
            put("resizeColumn", 1014);
            put("resizeDown", 1015);
            put("resizeUpLeft", 1016);
            put("resizeDownRight", 1017);
            put("resizeLeft", 1014);
            put("resizeLeftRight", 1014);
            put("resizeRight", 1014);
            put("resizeRow", 1015);
            put("resizeUp", 1015);
            put("resizeUpDown", 1015);
            put("resizeUpLeft", 1017);
            put("resizeUpRight", 1016);
            put("resizeUpLeftDownRight", 1017);
            put("resizeUpRightDownLeft", 1016);
            put("verticalText", 1009);
            put("wait", 1004);
            put("zoomIn", 1018);
            put("zoomOut", 1019);
        }
    }

    /* renamed from: cc.a$c */
    /* compiled from: MouseCursorPlugin */
    public interface C6854c {
        /* renamed from: c */
        PointerIcon mo22960c(int i);

        void setPointerIcon(PointerIcon pointerIcon);
    }

    public C6851a(C6854c cVar, C13505g gVar) {
        this.f31513a = cVar;
        this.f31514b = gVar;
        gVar.mo38635b(new C6852a());
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public PointerIcon m39422d(String str) {
        if (f31512c == null) {
            f31512c = new C6853b();
        }
        return this.f31513a.mo22960c(f31512c.getOrDefault(str, Integer.valueOf(AdError.NETWORK_ERROR_CODE)).intValue());
    }

    /* renamed from: c */
    public void mo22958c() {
        this.f31514b.mo38635b((C13505g.C13507b) null);
    }
}
