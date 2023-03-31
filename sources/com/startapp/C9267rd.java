package com.startapp;

import android.provider.Settings;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.regex.Pattern;
import p184aa.C6521a;
import p184aa.C6525e;
import p201ca.C6841a;

/* renamed from: com.startapp.rd */
/* compiled from: Sta */
public class C9267rd extends C9180o {

    /* renamed from: k */
    public static final Pattern f38163k = Pattern.compile("^[a-zA-Z0-9 ]+$");

    /* renamed from: a */
    public final C9230q f38164a;

    /* renamed from: b */
    public final C9205p f38165b;

    /* renamed from: c */
    public final List<C9017he> f38166c = new ArrayList();

    /* renamed from: d */
    public C9646xd f38167d;

    /* renamed from: e */
    public C6841a f38168e;

    /* renamed from: f */
    public boolean f38169f = false;

    /* renamed from: g */
    public boolean f38170g = false;

    /* renamed from: h */
    public final String f38171h;

    /* renamed from: i */
    public boolean f38172i;

    /* renamed from: j */
    public boolean f38173j;

    public C9267rd(C9205p pVar, C9230q qVar) {
        this.f38165b = pVar;
        this.f38164a = qVar;
        this.f38171h = UUID.randomUUID().toString();
        mo29883a((View) null);
        this.f38168e = (qVar.mo29842a() == C6521a.HTML || qVar.mo29842a() == C6521a.JAVASCRIPT) ? new C9285sd(qVar.mo29845d()) : new C9686zd(qVar.mo29843b(), qVar.mo29844c());
        this.f38168e.mo22949d();
        C9228pd.m49161a().mo29837a(this);
        this.f38168e.mo22942a(pVar);
    }

    /* renamed from: a */
    public void mo29775a() {
        if (!this.f38169f) {
            this.f38169f = true;
            C9228pd pdVar = C9228pd.f38085c;
            boolean b = pdVar.mo29838b();
            pdVar.f38087b.add(this);
            if (!b) {
                C9647xe a = C9647xe.m50536a();
                a.getClass();
                C8832ae aeVar = C8832ae.f36432d;
                aeVar.f36435c = a;
                aeVar.f36433a = true;
                aeVar.f36434b = false;
                aeVar.mo29112a();
                C9008hb.f36917h.mo29458a();
                C9229pe peVar = a.f39415d;
                peVar.f38092e = peVar.mo29839a();
                peVar.mo29840b();
                peVar.f38088a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, peVar);
            }
            float f = C9647xe.m50536a().f39412a;
            C6841a aVar = this.f38168e;
            C9268re.f38174a.mo29889a(aVar.mo22948c(), "setDeviceVolume", Float.valueOf(f));
            this.f38168e.mo22943a(this, this.f38164a);
        }
    }

    /* renamed from: a */
    public final void mo29883a(View view) {
        this.f38167d = new C9646xd((View) null);
    }

    /* renamed from: b */
    public View mo29884b() {
        return (View) this.f38167d.get();
    }

    /* renamed from: c */
    public boolean mo29885c() {
        return this.f38169f && !this.f38170g;
    }

    /* renamed from: d */
    public boolean mo29886d() {
        return C6525e.NATIVE == this.f38165b.f38034a;
    }

    /* renamed from: e */
    public boolean mo29887e() {
        return C6525e.NATIVE == this.f38165b.f38035b;
    }
}
