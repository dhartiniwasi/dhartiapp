package p218e6;

import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p033d5.C4141r;

/* renamed from: e6.l */
/* compiled from: com.google.android.gms:play-services-tasks@@18.0.2 */
public final class C9980l {
    /* renamed from: a */
    public static <TResult> TResult m51027a(C9975i<TResult> iVar) throws ExecutionException, InterruptedException {
        C4141r.m28219i();
        C4141r.m28222l(iVar, "Task must not be null");
        if (iVar.mo26361p()) {
            return m51034h(iVar);
        }
        C9982n nVar = new C9982n((C9981m) null);
        m51035i(iVar, nVar);
        nVar.mo32548b();
        return m51034h(iVar);
    }

    /* renamed from: b */
    public static <TResult> TResult m51028b(C9975i<TResult> iVar, long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        C4141r.m28219i();
        C4141r.m28222l(iVar, "Task must not be null");
        C4141r.m28222l(timeUnit, "TimeUnit must not be null");
        if (iVar.mo26361p()) {
            return m51034h(iVar);
        }
        C9982n nVar = new C9982n((C9981m) null);
        m51035i(iVar, nVar);
        if (nVar.mo32549e(j, timeUnit)) {
            return m51034h(iVar);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    @Deprecated
    /* renamed from: c */
    public static <TResult> C9975i<TResult> m51029c(Executor executor, Callable<TResult> callable) {
        C4141r.m28222l(executor, "Executor must not be null");
        C4141r.m28222l(callable, "Callback must not be null");
        C9976i0 i0Var = new C9976i0();
        executor.execute(new C9978j0(i0Var, callable));
        return i0Var;
    }

    /* renamed from: d */
    public static <TResult> C9975i<TResult> m51030d(Exception exc) {
        C9976i0 i0Var = new C9976i0();
        i0Var.mo32537t(exc);
        return i0Var;
    }

    /* renamed from: e */
    public static <TResult> C9975i<TResult> m51031e(TResult tresult) {
        C9976i0 i0Var = new C9976i0();
        i0Var.mo32538u(tresult);
        return i0Var;
    }

    /* renamed from: f */
    public static C9975i<Void> m51032f(Collection<? extends C9975i<?>> collection) {
        if (collection == null || collection.isEmpty()) {
            return m51031e((Object) null);
        }
        for (C9975i requireNonNull : collection) {
            Objects.requireNonNull(requireNonNull, "null tasks are not accepted");
        }
        C9976i0 i0Var = new C9976i0();
        C9984p pVar = new C9984p(collection.size(), i0Var);
        for (C9975i i : collection) {
            m51035i(i, pVar);
        }
        return i0Var;
    }

    /* renamed from: g */
    public static C9975i<Void> m51033g(C9975i<?>... iVarArr) {
        if (iVarArr == null || iVarArr.length == 0) {
            return m51031e((Object) null);
        }
        return m51032f(Arrays.asList(iVarArr));
    }

    /* renamed from: h */
    private static Object m51034h(C9975i iVar) throws ExecutionException {
        if (iVar.mo26362q()) {
            return iVar.mo26358m();
        }
        if (iVar.mo26360o()) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(iVar.mo26357l());
    }

    /* renamed from: i */
    private static void m51035i(C9975i iVar, C9983o oVar) {
        Executor executor = C9979k.f39918b;
        iVar.mo26352g(executor, oVar);
        iVar.mo26350e(executor, oVar);
        iVar.mo26346a(executor, oVar);
    }
}
