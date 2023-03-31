package com.startapp;

import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.webkit.WebView;
import com.startapp.sdk.omsdk.VerificationDetails;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import p184aa.C6523c;

/* renamed from: com.startapp.r7 */
/* compiled from: Sta */
public class C9260r7 {

    /* renamed from: a */
    public final C9180o f38148a;

    /* renamed from: b */
    public final C9101l f38149b;

    /* renamed from: c */
    public final C8999h6 f38150c;

    /* renamed from: d */
    public final AtomicBoolean f38151d = new AtomicBoolean();

    /* renamed from: e */
    public final AtomicBoolean f38152e = new AtomicBoolean();

    public C9260r7(WebView webView) {
        C9180o b = C9252r.m49207b(webView);
        this.f38148a = b;
        webView.getContext();
        this.f38149b = C9252r.m49200a(b);
        this.f38150c = null;
    }

    /* renamed from: a */
    public void mo29869a() {
        C9180o oVar = this.f38148a;
        if (oVar != null) {
            C9267rd rdVar = (C9267rd) oVar;
            if (!rdVar.f38170g) {
                rdVar.f38167d.clear();
                if (!rdVar.f38170g) {
                    rdVar.f38166c.clear();
                }
                rdVar.f38170g = true;
                C9268re.f38174a.mo29889a(rdVar.f38168e.mo22948c(), "finishSession", new Object[0]);
                C9228pd pdVar = C9228pd.f38085c;
                boolean b = pdVar.mo29838b();
                pdVar.f38086a.remove(rdVar);
                pdVar.f38087b.remove(rdVar);
                if (b && !pdVar.mo29838b()) {
                    C9647xe a = C9647xe.m50536a();
                    a.getClass();
                    C9008hb hbVar = C9008hb.f36917h;
                    hbVar.getClass();
                    Handler handler = C9008hb.f36919j;
                    if (handler != null) {
                        handler.removeCallbacks(C9008hb.f36921l);
                        C9008hb.f36919j = null;
                    }
                    hbVar.f36922a.clear();
                    C9008hb.f36918i.post(new C9030ib(hbVar));
                    C8832ae aeVar = C8832ae.f36432d;
                    aeVar.f36433a = false;
                    aeVar.f36434b = false;
                    aeVar.f36435c = null;
                    C9229pe peVar = a.f39415d;
                    peVar.f38088a.getContentResolver().unregisterContentObserver(peVar);
                }
                rdVar.f38168e.mo22946b();
                rdVar.f38168e = null;
            }
        }
    }

    /* renamed from: b */
    public void mo29872b() {
        if (this.f38149b != null && this.f38151d.compareAndSet(false, true)) {
            C9101l lVar = this.f38149b;
            C9542se.m50340b(lVar.f37233a);
            C9542se.m50341c(lVar.f37233a);
            if (!lVar.f37233a.mo29885c()) {
                try {
                    lVar.f37233a.mo29775a();
                } catch (Exception unused) {
                }
            }
            if (lVar.f37233a.mo29885c()) {
                C9267rd rdVar = lVar.f37233a;
                if (!rdVar.f38172i) {
                    C9268re.f38174a.mo29889a(rdVar.f38168e.mo22948c(), "publishImpressionEvent", new Object[0]);
                    rdVar.f38172i = true;
                    return;
                }
                throw new IllegalStateException("Impression event can only be sent once");
            }
        }
    }

    /* renamed from: c */
    public boolean mo29873c() {
        return this.f38148a != null;
    }

    /* renamed from: d */
    public void mo29874d() {
        if (this.f38149b != null && this.f38152e.compareAndSet(false, true)) {
            C9101l lVar = this.f38149b;
            C9542se.m50337a(lVar.f37233a);
            C9542se.m50341c(lVar.f37233a);
            C9267rd rdVar = lVar.f37233a;
            if (!rdVar.f38173j) {
                C9268re.f38174a.mo29889a(rdVar.f38168e.mo22948c(), "publishLoadedEvent", new Object[0]);
                rdVar.f38173j = true;
                return;
            }
            throw new IllegalStateException("Loaded event can only be sent once");
        }
    }

    /* renamed from: e */
    public void mo29875e() {
        C9180o oVar = this.f38148a;
        if (oVar != null) {
            oVar.mo29775a();
        }
    }

    public C9260r7(Context context, List<VerificationDetails> list, boolean z) {
        C9180o b = C9252r.m49206b(context, list, z);
        this.f38148a = b;
        this.f38149b = C9252r.m49200a(b);
        this.f38150c = z ? C9252r.m49205b(b) : null;
    }

    /* renamed from: a */
    public void mo29870a(View view) {
        C9180o oVar = this.f38148a;
        if (oVar != null) {
            C9267rd rdVar = (C9267rd) oVar;
            if (!rdVar.f38170g) {
                C9542se.m50338a((Object) view, "AdView is null");
                if (rdVar.mo29884b() != view) {
                    rdVar.f38167d = new C9646xd(view);
                    rdVar.f38168e.mo22940a();
                    Collection<T> unmodifiableCollection = Collections.unmodifiableCollection(C9228pd.f38085c.f38086a);
                    if (unmodifiableCollection != null && !unmodifiableCollection.isEmpty()) {
                        for (T t : unmodifiableCollection) {
                            if (t != rdVar && t.mo29884b() == view) {
                                t.f38167d.clear();
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public void mo29871a(View view, C6523c cVar, String str) {
        C9017he heVar;
        C9180o oVar = this.f38148a;
        if (oVar != null) {
            C9267rd rdVar = (C9267rd) oVar;
            if (!rdVar.f38170g) {
                if (view != null) {
                    Iterator<C9017he> it = rdVar.f38166c.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            heVar = null;
                            break;
                        }
                        heVar = it.next();
                        if (heVar.f36936a.get() == view) {
                            break;
                        }
                    }
                    if (heVar == null) {
                        rdVar.f38166c.add(new C9017he(view, cVar, (String) null));
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException("FriendlyObstruction is null");
            }
        }
    }
}
