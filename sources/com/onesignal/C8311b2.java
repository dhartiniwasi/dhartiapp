package com.onesignal;

import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.onesignal.b2 */
/* compiled from: OSObservable */
class C8311b2<ObserverType, StateType> {

    /* renamed from: a */
    private String f35350a;

    /* renamed from: b */
    private List<Object> f35351b = new ArrayList();

    /* renamed from: c */
    private boolean f35352c;

    /* renamed from: com.onesignal.b2$a */
    /* compiled from: OSObservable */
    class C8312a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Method f35353a;

        /* renamed from: b */
        final /* synthetic */ Object f35354b;

        /* renamed from: c */
        final /* synthetic */ Object f35355c;

        C8312a(Method method, Object obj, Object obj2) {
            this.f35353a = method;
            this.f35354b = obj;
            this.f35355c = obj2;
        }

        public void run() {
            try {
                this.f35353a.invoke(this.f35354b, new Object[]{this.f35355c});
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e2) {
                e2.printStackTrace();
            }
        }
    }

    C8311b2(String str, boolean z) {
        this.f35350a = str;
        this.f35352c = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo27628a(ObserverType observertype) {
        this.f35351b.add(new WeakReference(observertype));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo27629b(ObserverType observertype) {
        this.f35351b.add(observertype);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo27630c(StateType statetype) {
        Iterator<Object> it = this.f35351b.iterator();
        boolean z = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (next instanceof WeakReference) {
                next = ((WeakReference) next).get();
            }
            if (next != null) {
                Class<?> cls = next.getClass();
                try {
                    Method declaredMethod = cls.getDeclaredMethod(this.f35350a, new Class[]{statetype.getClass()});
                    declaredMethod.setAccessible(true);
                    if (this.f35352c) {
                        OSUtils.m46187T(new C8312a(declaredMethod, next, statetype));
                    } else {
                        try {
                            declaredMethod.invoke(next, new Object[]{statetype});
                        } catch (IllegalAccessException e) {
                            e.printStackTrace();
                        } catch (InvocationTargetException e2) {
                            e2.printStackTrace();
                        }
                    }
                    z = true;
                } catch (NoSuchMethodException e3) {
                    e3.printStackTrace();
                }
            }
        }
        return z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo27631d(ObserverType observertype) {
        for (int i = 0; i < this.f35351b.size(); i++) {
            Object obj = ((WeakReference) this.f35351b.get(i)).get();
            if (obj != null && obj.equals(observertype)) {
                this.f35351b.remove(i);
                return;
            }
        }
    }
}
