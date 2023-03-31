package p349s9;

import com.pichillilorenzo.flutter_inappwebview.C8710R;
import p212d9.C9914f;
import p212d9.C9918j;
import p248h9.C10475a;

/* renamed from: s9.j */
/* compiled from: AbstractExpandedDecoder */
public abstract class C12479j {

    /* renamed from: a */
    private final C10475a f45877a;

    /* renamed from: b */
    private final C12489s f45878b;

    C12479j(C10475a aVar) {
        this.f45877a = aVar;
        this.f45878b = new C12489s(aVar);
    }

    /* renamed from: a */
    public static C12479j m59499a(C10475a aVar) {
        if (aVar.mo33554c(1)) {
            return new C12476g(aVar);
        }
        if (!aVar.mo33554c(2)) {
            return new C12480k(aVar);
        }
        int g = C12489s.m59530g(aVar, 1, 4);
        if (g == 4) {
            return new C12470a(aVar);
        }
        if (g == 5) {
            return new C12471b(aVar);
        }
        int g2 = C12489s.m59530g(aVar, 1, 5);
        if (g2 == 12) {
            return new C12472c(aVar);
        }
        if (g2 == 13) {
            return new C12473d(aVar);
        }
        switch (C12489s.m59530g(aVar, 1, 7)) {
            case C8710R.styleable.AppCompatTheme_colorError:
                return new C12474e(aVar, "310", "11");
            case C8710R.styleable.AppCompatTheme_colorPrimary:
                return new C12474e(aVar, "320", "11");
            case C8710R.styleable.AppCompatTheme_colorPrimaryDark:
                return new C12474e(aVar, "310", "13");
            case C8710R.styleable.AppCompatTheme_colorSwitchThumbNormal:
                return new C12474e(aVar, "320", "13");
            case C8710R.styleable.AppCompatTheme_controlBackground:
                return new C12474e(aVar, "310", "15");
            case C8710R.styleable.AppCompatTheme_dialogCornerRadius:
                return new C12474e(aVar, "320", "15");
            case C8710R.styleable.AppCompatTheme_dialogPreferredPadding:
                return new C12474e(aVar, "310", "17");
            case C8710R.styleable.AppCompatTheme_dialogTheme:
                return new C12474e(aVar, "320", "17");
            default:
                throw new IllegalStateException("unknown decoder: " + aVar);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C12489s mo37252b() {
        return this.f45878b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final C10475a mo37253c() {
        return this.f45877a;
    }

    /* renamed from: d */
    public abstract String mo37248d() throws C9918j, C9914f;
}
