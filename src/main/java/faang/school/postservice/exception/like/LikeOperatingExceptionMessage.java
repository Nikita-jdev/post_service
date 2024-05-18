package faang.school.postservice.exception.like;

public enum LikeOperatingExceptionMessage {
    NON_EXISTING_POST_EXCEPTION("Post for the passed id doesn't exist in system."),
    NON_EXISTING_COMMENT_EXCEPTION("Comment for the passed id doesn't exist in system.");

    private final String message;

    LikeOperatingExceptionMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
