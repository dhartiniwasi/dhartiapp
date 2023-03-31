package p264io.flutter.embedding.android;

import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import java.util.HashSet;
import p186ac.C6539c;
import p264io.flutter.plugin.editing.C10703b;
import p297mb.C11881b;
import p417zb.C13498d;

/* renamed from: io.flutter.embedding.android.s */
/* compiled from: KeyboardManager */
public class C10661s implements C10703b.C10704a {

    /* renamed from: a */
    protected final C10666d[] f41841a;

    /* renamed from: b */
    private final HashSet<KeyEvent> f41842b = new HashSet<>();

    /* renamed from: c */
    private final C10668e f41843c;

    /* renamed from: io.flutter.embedding.android.s$b */
    /* compiled from: KeyboardManager */
    public static class C10663b {

        /* renamed from: a */
        private int f41844a = 0;

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public Character mo33991a(int i) {
            char c = (char) i;
            if ((Integer.MIN_VALUE & i) != 0) {
                int i2 = i & Integer.MAX_VALUE;
                int i3 = this.f41844a;
                if (i3 != 0) {
                    this.f41844a = KeyCharacterMap.getDeadChar(i3, i2);
                } else {
                    this.f41844a = i2;
                }
            } else {
                int i4 = this.f41844a;
                if (i4 != 0) {
                    int deadChar = KeyCharacterMap.getDeadChar(i4, i);
                    if (deadChar > 0) {
                        c = (char) deadChar;
                    }
                    this.f41844a = 0;
                }
            }
            return Character.valueOf(c);
        }
    }

    /* renamed from: io.flutter.embedding.android.s$c */
    /* compiled from: KeyboardManager */
    private class C10664c {

        /* renamed from: a */
        final KeyEvent f41845a;

        /* renamed from: b */
        int f41846b;

        /* renamed from: c */
        boolean f41847c = false;

        /* renamed from: io.flutter.embedding.android.s$c$a */
        /* compiled from: KeyboardManager */
        private class C10665a implements C10666d.C10667a {

            /* renamed from: a */
            boolean f41849a;

            private C10665a() {
                this.f41849a = false;
            }

            /* renamed from: a */
            public void mo33993a(boolean z) {
                if (!this.f41849a) {
                    this.f41849a = true;
                    C10664c cVar = C10664c.this;
                    int i = cVar.f41846b - 1;
                    cVar.f41846b = i;
                    boolean z2 = z | cVar.f41847c;
                    cVar.f41847c = z2;
                    if (i == 0 && !z2) {
                        C10661s.this.m53448d(cVar.f41845a);
                        return;
                    }
                    return;
                }
                throw new IllegalStateException("The onKeyEventHandledCallback should be called exactly once.");
            }
        }

        C10664c(KeyEvent keyEvent) {
            this.f41846b = C10661s.this.f41841a.length;
            this.f41845a = keyEvent;
        }

        /* renamed from: a */
        public C10666d.C10667a mo33992a() {
            return new C10665a();
        }
    }

    /* renamed from: io.flutter.embedding.android.s$d */
    /* compiled from: KeyboardManager */
    public interface C10666d {

        /* renamed from: io.flutter.embedding.android.s$d$a */
        /* compiled from: KeyboardManager */
        public interface C10667a {
            /* renamed from: a */
            void mo33993a(boolean z);
        }

        /* renamed from: a */
        void mo33981a(KeyEvent keyEvent, C10667a aVar);
    }

    /* renamed from: io.flutter.embedding.android.s$e */
    /* compiled from: KeyboardManager */
    public interface C10668e {
        /* renamed from: g */
        void mo33945g(KeyEvent keyEvent);

        C6539c getBinaryMessenger();

        /* renamed from: i */
        boolean mo33950i(KeyEvent keyEvent);
    }

    public C10661s(C10668e eVar) {
        this.f41843c = eVar;
        this.f41841a = new C10666d[]{new C10659r(eVar.getBinaryMessenger()), new C10653m(new C13498d(eVar.getBinaryMessenger()))};
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m53448d(KeyEvent keyEvent) {
        C10668e eVar = this.f41843c;
        if (eVar != null && !eVar.mo33950i(keyEvent)) {
            this.f41842b.add(keyEvent);
            this.f41843c.mo33945g(keyEvent);
            if (this.f41842b.remove(keyEvent)) {
                C11881b.m57389g("KeyboardManager", "A redispatched key event was consumed before reaching KeyboardManager");
            }
        }
    }

    /* renamed from: a */
    public boolean mo33989a(KeyEvent keyEvent) {
        if (this.f41842b.remove(keyEvent)) {
            return false;
        }
        if (this.f41841a.length > 0) {
            C10664c cVar = new C10664c(keyEvent);
            for (C10666d a : this.f41841a) {
                a.mo33981a(keyEvent, cVar.mo33992a());
            }
            return true;
        }
        m53448d(keyEvent);
        return true;
    }

    /* renamed from: c */
    public void mo33990c() {
        int size = this.f41842b.size();
        if (size > 0) {
            C11881b.m57389g("KeyboardManager", "A KeyboardManager was destroyed with " + String.valueOf(size) + " unhandled redispatch event(s).");
        }
    }
}
