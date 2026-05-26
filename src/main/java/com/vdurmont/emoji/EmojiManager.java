package com.vdurmont.emoji;

import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Holds the loaded emojis and provides search functions.
 *
 * @author Vincent DURMONT [vdurmont@gmail.com]
 */
public class EmojiManager {

    private static final String PATH = "/emojis.json";

    private static final Map<String, Emoji> EMOJIS_BY_ALIAS = new HashMap<String, Emoji>();

    private static final Map<String, Set<Emoji>> EMOJIS_BY_TAG = new HashMap<String, Set<Emoji>>();

    private static final List<Emoji> ALL_EMOJIS;

    static final EmojiTrie EMOJI_TRIE;

    static {
        try {
            InputStream stream = EmojiLoader.class.getResourceAsStream(PATH);
            List<Emoji> emojis = EmojiLoader.loadEmojis(stream);
            ALL_EMOJIS = emojis;
            for (Emoji emoji : emojis) {
                for (String tag : emoji.getTags()) {
                    if (EMOJIS_BY_TAG.get(tag) == null) {
                        EMOJIS_BY_TAG.put(tag, new HashSet<Emoji>());
                    }
                    EMOJIS_BY_TAG.get(tag).add(emoji);
                }
                for (String alias : emoji.getAliases()) {
                    EMOJIS_BY_ALIAS.put(alias, emoji);
                }
            }
            EMOJI_TRIE = new EmojiTrie(emojis);
            Collections.sort(ALL_EMOJIS, new Comparator<Emoji>() {

                public int compare(Emoji e1, Emoji e2) {
                    throw new UnsupportedOperationException("STUB: not implemented");
                }
            });
            stream.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * No need for a constructor, all the methods are static.
     */
    private EmojiManager() {
    }

    /**
     * Returns all the {@link com.vdurmont.emoji.Emoji}s for a given tag.
     *
     * @param tag the tag
     *
     * @return the associated {@link com.vdurmont.emoji.Emoji}s, null if the tag
     * is unknown
     */
    public static Set<Emoji> getForTag(String tag) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns the {@link com.vdurmont.emoji.Emoji} for a given alias.
     *
     * @param alias the alias
     *
     * @return the associated {@link com.vdurmont.emoji.Emoji}, null if the alias
     * is unknown
     */
    public static Emoji getForAlias(String alias) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private static String trimAlias(String alias) {
        int len = alias.length();
        return alias.substring(alias.charAt(0) == ':' ? 1 : 0, alias.charAt(len - 1) == ':' ? len - 1 : len);
    }

    /**
     * Returns the {@link com.vdurmont.emoji.Emoji} for a given unicode.
     *
     * @param unicode the the unicode
     *
     * @return the associated {@link com.vdurmont.emoji.Emoji}, null if the
     * unicode is unknown
     */
    public static Emoji getByUnicode(String unicode) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns all the {@link com.vdurmont.emoji.Emoji}s
     *
     * @return all the {@link com.vdurmont.emoji.Emoji}s
     */
    public static Collection<Emoji> getAll() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Tests if a given String is an emoji.
     *
     * @param string the string to test
     *
     * @return true if the string is an emoji's unicode, false else
     */
    public static boolean isEmoji(String string) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Tests if a given String contains an emoji.
     *
     * @param string the string to test
     *
     * @return true if the string contains an emoji's unicode, false otherwise
     */
    public static boolean containsEmoji(String string) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Tests if a given String only contains emojis.
     *
     * @param string the string to test
     *
     * @return true if the string only contains emojis, false else
     */
    public static boolean isOnlyEmojis(String string) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Checks if sequence of chars contain an emoji.
     * @param sequence Sequence of char that may contain emoji in full or
     * partially.
     *
     * @return
     * &lt;li&gt;
     *   Matches.EXACTLY if char sequence in its entirety is an emoji
     * &lt;/li&gt;
     * &lt;li&gt;
     *   Matches.POSSIBLY if char sequence matches prefix of an emoji
     * &lt;/li&gt;
     * &lt;li&gt;
     *   Matches.IMPOSSIBLE if char sequence matches no emoji or prefix of an
     *   emoji
     * &lt;/li&gt;
     */
    public static EmojiTrie.Matches isEmoji(char[] sequence) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns all the tags in the database
     *
     * @return the tags
     */
    public static Collection<String> getAllTags() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
