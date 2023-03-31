package p218e6;

/* renamed from: e6.b */
/* compiled from: com.google.android.gms:play-services-tasks@@18.0.2 */
public final class C9961b extends IllegalStateException {
    private C9961b(String str, Throwable th) {
        super(str, th);
    }

    /* renamed from: a */
    public static IllegalStateException m50958a(C9975i<?> iVar) {
        String str;
        if (!iVar.mo26361p()) {
            return new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
        }
        Exception l = iVar.mo26357l();
        if (l != null) {
            str = "failure";
        } else if (iVar.mo26362q()) {
            str = "result ".concat(String.valueOf(iVar.mo26358m()));
        } else {
            str = iVar.mo26360o() ? "cancellation" : "unknown issue";
        }
        return new C9961b("Complete with: ".concat(str), l);
    }
}
