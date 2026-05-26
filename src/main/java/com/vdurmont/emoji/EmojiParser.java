package com.vdurmont.emoji;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Provides methods to parse strings with emojis.
 *
 * @author Vincent DURMONT [vdurmont@gmail.com]
 */
public class EmojiParser {

    /**
     * See {@link #parseToAliases(String, FitzpatrickAction)} with the action
     * "PARSE"
     *
     * @param input the string to parse
     *
     * @return the string with the emojis replaced by their alias.
     */
    public static String parseToAliases(String input) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Replaces the emoji's unicode occurrences by one of their alias
     * (between 2 ':').<br>
     * Example: <code>😄</code> will be replaced by <code>:smile:</code><br>
     * <br>
     * When a fitzpatrick modifier is present with a PARSE action, a "|" will be
     * appendend to the alias, with the fitzpatrick type.<br>
     * Example: <code>👦🏿</code> will be replaced by
     * <code>:boy|type_6:</code><br>
     * The fitzpatrick types are: type_1_2, type_3, type_4, type_5, type_6<br>
     * <br>
     * When a fitzpatrick modifier is present with a REMOVE action, the modifier
     * will be deleted.<br>
     * Example: <code>👦🏿</code> will be replaced by <code>:boy:</code><br>
     * <br>
     * When a fitzpatrick modifier is present with a IGNORE action, the modifier
     * will be ignored.<br>
     * Example: <code>👦🏿</code> will be replaced by <code>:boy:🏿</code><br>
     *
     * @param input             the string to parse
     * @param fitzpatrickAction the action to apply for the fitzpatrick modifiers
     *
     * @return the string with the emojis replaced by their alias.
     */
    public static String parseToAliases(String input, final FitzpatrickAction fitzpatrickAction) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Replace all emojis with character
     *
     * @param str the string to process
     * @param replacementString replacement the string that will replace all the emojis
     * @return the string with replaced character
     */
    public static String replaceAllEmojis(String str, final String replacementString) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Replaces the emoji's aliases (between 2 ':') occurrences and the html
     * representations by their unicode.<br>
     * Examples:<br>
     * <code>:smile:</code> will be replaced by <code>😄</code><br>
     * <code>&amp;#128516;</code> will be replaced by <code>😄</code><br>
     * <code>:boy|type_6:</code> will be replaced by <code>👦🏿</code>
     *
     * @param input the string to parse
     *
     * @return the string with the aliases and html representations replaced by
     * their unicode.
     */
    public static String parseToUnicode(String input) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Finds the alias in the given string starting at the given point, null otherwise
     */
    protected static AliasCandidate getAliasAt(String input, int start) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Finds the HTML encoded emoji in the given string starting at the given point, null otherwise
     */
    protected static AliasCandidate getHtmlEncodedEmojiAt(String input, int start) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * See {@link #parseToHtmlDecimal(String, FitzpatrickAction)} with the action
     * "PARSE"
     *
     * @param input the string to parse
     *
     * @return the string with the emojis replaced by their html decimal
     * representation.
     */
    public static String parseToHtmlDecimal(String input) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Replaces the emoji's unicode occurrences by their html representation.<br>
     * Example: <code>😄</code> will be replaced by <code>&amp;#128516;</code><br>
     * <br>
     * When a fitzpatrick modifier is present with a PARSE or REMOVE action, the
     * modifier will be deleted from the string.<br>
     * Example: <code>👦🏿</code> will be replaced by
     * <code>&amp;#128102;</code><br>
     * <br>
     * When a fitzpatrick modifier is present with a IGNORE action, the modifier
     * will be ignored and will remain in the string.<br>
     * Example: <code>👦🏿</code> will be replaced by
     * <code>&amp;#128102;🏿</code>
     *
     * @param input             the string to parse
     * @param fitzpatrickAction the action to apply for the fitzpatrick modifiers
     *
     * @return the string with the emojis replaced by their html decimal
     * representation.
     */
    public static String parseToHtmlDecimal(String input, final FitzpatrickAction fitzpatrickAction) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * See {@link #parseToHtmlHexadecimal(String, FitzpatrickAction)} with the
     * action "PARSE"
     *
     * @param input the string to parse
     *
     * @return the string with the emojis replaced by their html hex
     * representation.
     */
    public static String parseToHtmlHexadecimal(String input) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Replaces the emoji's unicode occurrences by their html hex
     * representation.<br>
     * Example: <code>👦</code> will be replaced by <code>&amp;#x1f466;</code><br>
     * <br>
     * When a fitzpatrick modifier is present with a PARSE or REMOVE action, the
     * modifier will be deleted.<br>
     * Example: <code>👦🏿</code> will be replaced by
     * <code>&amp;#x1f466;</code><br>
     * <br>
     * When a fitzpatrick modifier is present with a IGNORE action, the modifier
     * will be ignored and will remain in the string.<br>
     * Example: <code>👦🏿</code> will be replaced by
     * <code>&amp;#x1f466;🏿</code>
     *
     * @param input             the string to parse
     * @param fitzpatrickAction the action to apply for the fitzpatrick modifiers
     *
     * @return the string with the emojis replaced by their html hex
     * representation.
     */
    public static String parseToHtmlHexadecimal(String input, final FitzpatrickAction fitzpatrickAction) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Removes all emojis from a String
     *
     * @param str the string to process
     *
     * @return the string without any emoji
     */
    public static String removeAllEmojis(String str) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * judge char in selector range
     * @param ch
     * @return
     */
    public static boolean isVariationSelector(char ch) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Removes a set of emojis from a String
     *
     * @param str            the string to process
     * @param emojisToRemove the emojis to remove from this string
     *
     * @return the string without the emojis that were removed
     */
    public static String removeEmojis(String str, final Collection<Emoji> emojisToRemove) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Removes all the emojis in a String except a provided set
     *
     * @param str          the string to process
     * @param emojisToKeep the emojis to keep in this string
     *
     * @return the string without the emojis that were removed
     */
    public static String removeAllEmojisExcept(String str, final Collection<Emoji> emojisToKeep) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Detects all unicode emojis in input string and replaces them with the
     * return value of transformer.transform()
     *
     * @param input the string to process
     * @param transformer emoji transformer to apply to each emoji
     *
     * @return input string with all emojis transformed
     */
    public static String parseFromUnicode(String input, EmojiTransformer transformer) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static List<String> extractEmojis(String input) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Generates a list UnicodeCandidates found in input string. A
     * UnicodeCandidate is created for every unicode emoticon found in input
     * string, additionally if Fitzpatrick modifier follows the emoji, it is
     * included in UnicodeCandidate. Finally, it contains start and end index of
     * unicode emoji itself (WITHOUT Fitzpatrick modifier whether it is there or
     * not!).
     *
     * @param input String to find all unicode emojis in
     * @return List of UnicodeCandidates for each unicode emote in text
     */
    protected static List<UnicodeCandidate> getUnicodeCandidates(String input) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Finds the next UnicodeCandidate after a given starting index
     *
     * @param chars char array to find UnicodeCandidate in
     * @param start starting index for search
     * @return the next UnicodeCandidate or null if no UnicodeCandidate is found after start index
     */
    protected static UnicodeCandidate getNextUnicodeCandidate(char[] chars, int start) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns end index of a unicode emoji if it is found in text starting at
     * index startPos, -1 if not found.
     * This returns the longest matching emoji, for example, in
     * "\uD83D\uDC68\u200D\uD83D\uDC69\u200D\uD83D\uDC66"
     * it will find alias:family_man_woman_boy, NOT alias:man
     *
     * @param text the current text where we are looking for an emoji
     * @param startPos the position in the text where we should start looking for
     * an emoji end
     *
     * @return the end index of the unicode emoji starting at startPos. -1 if not
     * found
     */
    protected static int getEmojiEndPos(char[] text, int startPos) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static class UnicodeCandidate {

        private final Emoji emoji;

        private final Fitzpatrick fitzpatrick;

        private final int startIndex;

        private UnicodeCandidate(Emoji emoji, String fitzpatrick, int startIndex) {
            this.emoji = emoji;
            this.fitzpatrick = Fitzpatrick.fitzpatrickFromUnicode(fitzpatrick);
            this.startIndex = startIndex;
        }

        public Emoji getEmoji() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public boolean hasFitzpatrick() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public Fitzpatrick getFitzpatrick() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public String getFitzpatrickType() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public String getFitzpatrickUnicode() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public int getEmojiStartIndex() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public int getEmojiEndIndex() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public int getFitzpatrickEndIndex() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }

    protected static class AliasCandidate {

        public final Emoji emoji;

        public final Fitzpatrick fitzpatrick;

        public final int startIndex;

        public final int endIndex;

        private AliasCandidate(Emoji emoji, Fitzpatrick fitzpatrick, int startIndex, int endIndex) {
            this.emoji = emoji;
            this.fitzpatrick = fitzpatrick;
            this.startIndex = startIndex;
            this.endIndex = endIndex;
        }
    }

    /**
     * Enum used to indicate what should be done when a Fitzpatrick modifier is
     * found.
     */
    public enum FitzpatrickAction {

        /**
         * Tries to match the Fitzpatrick modifier with the previous emoji
         */
        PARSE,
        /**
         * Removes the Fitzpatrick modifier from the string
         */
        REMOVE,
        /**
         * Ignores the Fitzpatrick modifier (it will stay in the string)
         */
        IGNORE
    }

    public interface EmojiTransformer {

        String transform(UnicodeCandidate unicodeCandidate);
    }
}
