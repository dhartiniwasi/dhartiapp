package p133s1;

/* renamed from: s1.b */
/* compiled from: Retries */
public final class C5474b {
    /* renamed from: a */
    public static <TInput, TResult, TException extends Throwable> TResult m33406a(int i, TInput tinput, C5473a<TInput, TResult, TException> aVar, C5475c<TInput, TResult> cVar) throws Throwable {
        TResult apply;
        if (i < 1) {
            return aVar.apply(tinput);
        }
        do {
            apply = aVar.apply(tinput);
            tinput = cVar.mo7716a(tinput, apply);
            if (tinput == null || i - 1 < 1) {
                return apply;
            }
            apply = aVar.apply(tinput);
            tinput = cVar.mo7716a(tinput, apply);
            break;
        } while (i - 1 < 1);
        return apply;
    }
}
