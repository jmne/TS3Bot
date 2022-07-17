package net.server.json;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Data_ {

    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("slug")
    @Expose
    private String slug;
    @SerializedName("bitly_gif_url")
    @Expose
    private String bitlyGifUrl;
    @SerializedName("bitly_url")
    @Expose
    private String bitlyUrl;
    @SerializedName("embed_url")
    @Expose
    private String embedUrl;
    @SerializedName("username")
    @Expose
    private String username;
    @SerializedName("source")
    @Expose
    private String source;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("rating")
    @Expose
    private String rating;
    @SerializedName("content_url")
    @Expose
    private String contentUrl;
    @SerializedName("source_tld")
    @Expose
    private String sourceTld;
    @SerializedName("source_post_url")
    @Expose
    private String sourcePostUrl;
    @SerializedName("is_sticker")
    @Expose
    private Integer isSticker;
    @SerializedName("import_datetime")
    @Expose
    private String importDatetime;
    @SerializedName("trending_datetime")
    @Expose
    private String trendingDatetime;
    @SerializedName("image_original_url")
    @Expose
    private String imageOriginalUrl;
    @SerializedName("image_url")
    @Expose
    private String imageUrl;
    @SerializedName("image_mp4_url")
    @Expose
    private String imageMp4Url;
    @SerializedName("image_frames")
    @Expose
    private String imageFrames;
    @SerializedName("image_width")
    @Expose
    private String imageWidth;
    @SerializedName("image_height")
    @Expose
    private String imageHeight;
    @SerializedName("fixed_height_downsampled_url")
    @Expose
    private String fixedHeightDownsampledUrl;
    @SerializedName("fixed_height_downsampled_width")
    @Expose
    private String fixedHeightDownsampledWidth;
    @SerializedName("fixed_height_downsampled_height")
    @Expose
    private String fixedHeightDownsampledHeight;
    @SerializedName("fixed_width_downsampled_url")
    @Expose
    private String fixedWidthDownsampledUrl;
    @SerializedName("fixed_width_downsampled_width")
    @Expose
    private String fixedWidthDownsampledWidth;
    @SerializedName("fixed_width_downsampled_height")
    @Expose
    private String fixedWidthDownsampledHeight;
    @SerializedName("fixed_height_small_url")
    @Expose
    private String fixedHeightSmallUrl;
    @SerializedName("fixed_height_small_still_url")
    @Expose
    private String fixedHeightSmallStillUrl;
    @SerializedName("fixed_height_small_width")
    @Expose
    private String fixedHeightSmallWidth;
    @SerializedName("fixed_height_small_height")
    @Expose
    private String fixedHeightSmallHeight;
    @SerializedName("fixed_width_small_url")
    @Expose
    private String fixedWidthSmallUrl;
    @SerializedName("fixed_width_small_still_url")
    @Expose
    private String fixedWidthSmallStillUrl;
    @SerializedName("fixed_width_small_width")
    @Expose
    private String fixedWidthSmallWidth;
    @SerializedName("fixed_width_small_height")
    @Expose
    private String fixedWidthSmallHeight;
    @SerializedName("caption")
    @Expose
    private String caption;

    /**
     * No args constructor for use in serialization
     */
    public Data_() {
    }

    /**
     * @param embedUrl
     * @param fixedHeightSmallWidth
     * @param fixedWidthSmallStillUrl
     * @param sourcePostUrl
     * @param fixedWidthDownsampledHeight
     * @param bitlyUrl
     * @param rating
     * @param caption
     * @param source
     * @param type
     * @param title
     * @param fixedHeightDownsampledUrl
     * @param fixedWidthSmallHeight
     * @param sourceTld
     * @param imageUrl
     * @param fixedHeightSmallUrl
     * @param id
     * @param bitlyGifUrl
     * @param fixedWidthSmallUrl
     * @param fixedWidthSmallWidth
     * @param slug
     * @param importDatetime
     * @param imageWidth
     * @param fixedWidthDownsampledUrl
     * @param fixedHeightSmallStillUrl
     * @param fixedHeightSmallHeight
     * @param trendingDatetime
     * @param fixedHeightDownsampledHeight
     * @param url
     * @param imageMp4Url
     * @param imageHeight
     * @param contentUrl
     * @param isSticker
     * @param imageOriginalUrl
     * @param imageFrames
     * @param fixedWidthDownsampledWidth
     * @param fixedHeightDownsampledWidth
     * @param username
     */
    public Data_(String type, String id, String url, String slug, String bitlyGifUrl, String bitlyUrl,
                 String embedUrl, String username, String source, String title, String rating, String contentUrl,
                 String sourceTld, String sourcePostUrl, Integer isSticker, String importDatetime,
                 String trendingDatetime, String imageOriginalUrl, String imageUrl, String imageMp4Url,
                 String imageFrames, String imageWidth, String imageHeight, String fixedHeightDownsampledUrl,
                 String fixedHeightDownsampledWidth, String fixedHeightDownsampledHeight,
                 String fixedWidthDownsampledUrl, String fixedWidthDownsampledWidth,
                 String fixedWidthDownsampledHeight, String fixedHeightSmallUrl, String fixedHeightSmallStillUrl,
                 String fixedHeightSmallWidth, String fixedHeightSmallHeight, String fixedWidthSmallUrl,
                 String fixedWidthSmallStillUrl, String fixedWidthSmallWidth, String fixedWidthSmallHeight,
                 String caption) {
        super();
        this.type = type;
        this.id = id;
        this.url = url;
        this.slug = slug;
        this.bitlyGifUrl = bitlyGifUrl;
        this.bitlyUrl = bitlyUrl;
        this.embedUrl = embedUrl;
        this.username = username;
        this.source = source;
        this.title = title;
        this.rating = rating;
        this.contentUrl = contentUrl;
        this.sourceTld = sourceTld;
        this.sourcePostUrl = sourcePostUrl;
        this.isSticker = isSticker;
        this.importDatetime = importDatetime;
        this.trendingDatetime = trendingDatetime;
        this.imageOriginalUrl = imageOriginalUrl;
        this.imageUrl = imageUrl;
        this.imageMp4Url = imageMp4Url;
        this.imageFrames = imageFrames;
        this.imageWidth = imageWidth;
        this.imageHeight = imageHeight;
        this.fixedHeightDownsampledUrl = fixedHeightDownsampledUrl;
        this.fixedHeightDownsampledWidth = fixedHeightDownsampledWidth;
        this.fixedHeightDownsampledHeight = fixedHeightDownsampledHeight;
        this.fixedWidthDownsampledUrl = fixedWidthDownsampledUrl;
        this.fixedWidthDownsampledWidth = fixedWidthDownsampledWidth;
        this.fixedWidthDownsampledHeight = fixedWidthDownsampledHeight;
        this.fixedHeightSmallUrl = fixedHeightSmallUrl;
        this.fixedHeightSmallStillUrl = fixedHeightSmallStillUrl;
        this.fixedHeightSmallWidth = fixedHeightSmallWidth;
        this.fixedHeightSmallHeight = fixedHeightSmallHeight;
        this.fixedWidthSmallUrl = fixedWidthSmallUrl;
        this.fixedWidthSmallStillUrl = fixedWidthSmallStillUrl;
        this.fixedWidthSmallWidth = fixedWidthSmallWidth;
        this.fixedWidthSmallHeight = fixedWidthSmallHeight;
        this.caption = caption;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Data_ withType(String type) {
        this.type = type;
        return this;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Data_ withId(String id) {
        this.id = id;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Data_ withUrl(String url) {
        this.url = url;
        return this;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public Data_ withSlug(String slug) {
        this.slug = slug;
        return this;
    }

    public String getBitlyGifUrl() {
        return bitlyGifUrl;
    }

    public void setBitlyGifUrl(String bitlyGifUrl) {
        this.bitlyGifUrl = bitlyGifUrl;
    }

    public Data_ withBitlyGifUrl(String bitlyGifUrl) {
        this.bitlyGifUrl = bitlyGifUrl;
        return this;
    }

    public String getBitlyUrl() {
        return bitlyUrl;
    }

    public void setBitlyUrl(String bitlyUrl) {
        this.bitlyUrl = bitlyUrl;
    }

    public Data_ withBitlyUrl(String bitlyUrl) {
        this.bitlyUrl = bitlyUrl;
        return this;
    }

    public String getEmbedUrl() {
        return embedUrl;
    }

    public void setEmbedUrl(String embedUrl) {
        this.embedUrl = embedUrl;
    }

    public Data_ withEmbedUrl(String embedUrl) {
        this.embedUrl = embedUrl;
        return this;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Data_ withUsername(String username) {
        this.username = username;
        return this;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public Data_ withSource(String source) {
        this.source = source;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Data_ withTitle(String title) {
        this.title = title;
        return this;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public Data_ withRating(String rating) {
        this.rating = rating;
        return this;
    }

    public String getContentUrl() {
        return contentUrl;
    }

    public void setContentUrl(String contentUrl) {
        this.contentUrl = contentUrl;
    }

    public Data_ withContentUrl(String contentUrl) {
        this.contentUrl = contentUrl;
        return this;
    }

    public String getSourceTld() {
        return sourceTld;
    }

    public void setSourceTld(String sourceTld) {
        this.sourceTld = sourceTld;
    }

    public Data_ withSourceTld(String sourceTld) {
        this.sourceTld = sourceTld;
        return this;
    }

    public String getSourcePostUrl() {
        return sourcePostUrl;
    }

    public void setSourcePostUrl(String sourcePostUrl) {
        this.sourcePostUrl = sourcePostUrl;
    }

    public Data_ withSourcePostUrl(String sourcePostUrl) {
        this.sourcePostUrl = sourcePostUrl;
        return this;
    }

    public Integer getIsSticker() {
        return isSticker;
    }

    public void setIsSticker(Integer isSticker) {
        this.isSticker = isSticker;
    }

    public Data_ withIsSticker(Integer isSticker) {
        this.isSticker = isSticker;
        return this;
    }

    public String getImportDatetime() {
        return importDatetime;
    }

    public void setImportDatetime(String importDatetime) {
        this.importDatetime = importDatetime;
    }

    public Data_ withImportDatetime(String importDatetime) {
        this.importDatetime = importDatetime;
        return this;
    }

    public String getTrendingDatetime() {
        return trendingDatetime;
    }

    public void setTrendingDatetime(String trendingDatetime) {
        this.trendingDatetime = trendingDatetime;
    }

    public Data_ withTrendingDatetime(String trendingDatetime) {
        this.trendingDatetime = trendingDatetime;
        return this;
    }

    public String getImageOriginalUrl() {
        return imageOriginalUrl;
    }

    public void setImageOriginalUrl(String imageOriginalUrl) {
        this.imageOriginalUrl = imageOriginalUrl;
    }

    public Data_ withImageOriginalUrl(String imageOriginalUrl) {
        this.imageOriginalUrl = imageOriginalUrl;
        return this;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Data_ withImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }

    public String getImageMp4Url() {
        return imageMp4Url;
    }

    public void setImageMp4Url(String imageMp4Url) {
        this.imageMp4Url = imageMp4Url;
    }

    public Data_ withImageMp4Url(String imageMp4Url) {
        this.imageMp4Url = imageMp4Url;
        return this;
    }

    public String getImageFrames() {
        return imageFrames;
    }

    public void setImageFrames(String imageFrames) {
        this.imageFrames = imageFrames;
    }

    public Data_ withImageFrames(String imageFrames) {
        this.imageFrames = imageFrames;
        return this;
    }

    public String getImageWidth() {
        return imageWidth;
    }

    public void setImageWidth(String imageWidth) {
        this.imageWidth = imageWidth;
    }

    public Data_ withImageWidth(String imageWidth) {
        this.imageWidth = imageWidth;
        return this;
    }

    public String getImageHeight() {
        return imageHeight;
    }

    public void setImageHeight(String imageHeight) {
        this.imageHeight = imageHeight;
    }

    public Data_ withImageHeight(String imageHeight) {
        this.imageHeight = imageHeight;
        return this;
    }

    public String getFixedHeightDownsampledUrl() {
        return fixedHeightDownsampledUrl;
    }

    public void setFixedHeightDownsampledUrl(String fixedHeightDownsampledUrl) {
        this.fixedHeightDownsampledUrl = fixedHeightDownsampledUrl;
    }

    public Data_ withFixedHeightDownsampledUrl(String fixedHeightDownsampledUrl) {
        this.fixedHeightDownsampledUrl = fixedHeightDownsampledUrl;
        return this;
    }

    public String getFixedHeightDownsampledWidth() {
        return fixedHeightDownsampledWidth;
    }

    public void setFixedHeightDownsampledWidth(String fixedHeightDownsampledWidth) {
        this.fixedHeightDownsampledWidth = fixedHeightDownsampledWidth;
    }

    public Data_ withFixedHeightDownsampledWidth(String fixedHeightDownsampledWidth) {
        this.fixedHeightDownsampledWidth = fixedHeightDownsampledWidth;
        return this;
    }

    public String getFixedHeightDownsampledHeight() {
        return fixedHeightDownsampledHeight;
    }

    public void setFixedHeightDownsampledHeight(String fixedHeightDownsampledHeight) {
        this.fixedHeightDownsampledHeight = fixedHeightDownsampledHeight;
    }

    public Data_ withFixedHeightDownsampledHeight(String fixedHeightDownsampledHeight) {
        this.fixedHeightDownsampledHeight = fixedHeightDownsampledHeight;
        return this;
    }

    public String getFixedWidthDownsampledUrl() {
        return fixedWidthDownsampledUrl;
    }

    public void setFixedWidthDownsampledUrl(String fixedWidthDownsampledUrl) {
        this.fixedWidthDownsampledUrl = fixedWidthDownsampledUrl;
    }

    public Data_ withFixedWidthDownsampledUrl(String fixedWidthDownsampledUrl) {
        this.fixedWidthDownsampledUrl = fixedWidthDownsampledUrl;
        return this;
    }

    public String getFixedWidthDownsampledWidth() {
        return fixedWidthDownsampledWidth;
    }

    public void setFixedWidthDownsampledWidth(String fixedWidthDownsampledWidth) {
        this.fixedWidthDownsampledWidth = fixedWidthDownsampledWidth;
    }

    public Data_ withFixedWidthDownsampledWidth(String fixedWidthDownsampledWidth) {
        this.fixedWidthDownsampledWidth = fixedWidthDownsampledWidth;
        return this;
    }

    public String getFixedWidthDownsampledHeight() {
        return fixedWidthDownsampledHeight;
    }

    public void setFixedWidthDownsampledHeight(String fixedWidthDownsampledHeight) {
        this.fixedWidthDownsampledHeight = fixedWidthDownsampledHeight;
    }

    public Data_ withFixedWidthDownsampledHeight(String fixedWidthDownsampledHeight) {
        this.fixedWidthDownsampledHeight = fixedWidthDownsampledHeight;
        return this;
    }

    public String getFixedHeightSmallUrl() {
        return fixedHeightSmallUrl;
    }

    public void setFixedHeightSmallUrl(String fixedHeightSmallUrl) {
        this.fixedHeightSmallUrl = fixedHeightSmallUrl;
    }

    public Data_ withFixedHeightSmallUrl(String fixedHeightSmallUrl) {
        this.fixedHeightSmallUrl = fixedHeightSmallUrl;
        return this;
    }

    public String getFixedHeightSmallStillUrl() {
        return fixedHeightSmallStillUrl;
    }

    public void setFixedHeightSmallStillUrl(String fixedHeightSmallStillUrl) {
        this.fixedHeightSmallStillUrl = fixedHeightSmallStillUrl;
    }

    public Data_ withFixedHeightSmallStillUrl(String fixedHeightSmallStillUrl) {
        this.fixedHeightSmallStillUrl = fixedHeightSmallStillUrl;
        return this;
    }

    public String getFixedHeightSmallWidth() {
        return fixedHeightSmallWidth;
    }

    public void setFixedHeightSmallWidth(String fixedHeightSmallWidth) {
        this.fixedHeightSmallWidth = fixedHeightSmallWidth;
    }

    public Data_ withFixedHeightSmallWidth(String fixedHeightSmallWidth) {
        this.fixedHeightSmallWidth = fixedHeightSmallWidth;
        return this;
    }

    public String getFixedHeightSmallHeight() {
        return fixedHeightSmallHeight;
    }

    public void setFixedHeightSmallHeight(String fixedHeightSmallHeight) {
        this.fixedHeightSmallHeight = fixedHeightSmallHeight;
    }

    public Data_ withFixedHeightSmallHeight(String fixedHeightSmallHeight) {
        this.fixedHeightSmallHeight = fixedHeightSmallHeight;
        return this;
    }

    public String getFixedWidthSmallUrl() {
        return fixedWidthSmallUrl;
    }

    public void setFixedWidthSmallUrl(String fixedWidthSmallUrl) {
        this.fixedWidthSmallUrl = fixedWidthSmallUrl;
    }

    public Data_ withFixedWidthSmallUrl(String fixedWidthSmallUrl) {
        this.fixedWidthSmallUrl = fixedWidthSmallUrl;
        return this;
    }

    public String getFixedWidthSmallStillUrl() {
        return fixedWidthSmallStillUrl;
    }

    public void setFixedWidthSmallStillUrl(String fixedWidthSmallStillUrl) {
        this.fixedWidthSmallStillUrl = fixedWidthSmallStillUrl;
    }

    public Data_ withFixedWidthSmallStillUrl(String fixedWidthSmallStillUrl) {
        this.fixedWidthSmallStillUrl = fixedWidthSmallStillUrl;
        return this;
    }

    public String getFixedWidthSmallWidth() {
        return fixedWidthSmallWidth;
    }

    public void setFixedWidthSmallWidth(String fixedWidthSmallWidth) {
        this.fixedWidthSmallWidth = fixedWidthSmallWidth;
    }

    public Data_ withFixedWidthSmallWidth(String fixedWidthSmallWidth) {
        this.fixedWidthSmallWidth = fixedWidthSmallWidth;
        return this;
    }

    public String getFixedWidthSmallHeight() {
        return fixedWidthSmallHeight;
    }

    public void setFixedWidthSmallHeight(String fixedWidthSmallHeight) {
        this.fixedWidthSmallHeight = fixedWidthSmallHeight;
    }

    public Data_ withFixedWidthSmallHeight(String fixedWidthSmallHeight) {
        this.fixedWidthSmallHeight = fixedWidthSmallHeight;
        return this;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public Data_ withCaption(String caption) {
        this.caption = caption;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("type", type).append("id", id).append("url", url).append("slug",
                slug).append("bitlyGifUrl", bitlyGifUrl).append("bitlyUrl", bitlyUrl).append("embedUrl", embedUrl).append("username", username).append("source", source).append("title", title).append("rating", rating).append("contentUrl", contentUrl).append("sourceTld", sourceTld).append("sourcePostUrl", sourcePostUrl).append("isSticker", isSticker).append("importDatetime", importDatetime).append("trendingDatetime", trendingDatetime).append("imageOriginalUrl", imageOriginalUrl).append("imageUrl", imageUrl).append("imageMp4Url", imageMp4Url).append("imageFrames", imageFrames).append("imageWidth", imageWidth).append("imageHeight", imageHeight).append("fixedHeightDownsampledUrl", fixedHeightDownsampledUrl).append("fixedHeightDownsampledWidth", fixedHeightDownsampledWidth).append("fixedHeightDownsampledHeight", fixedHeightDownsampledHeight).append("fixedWidthDownsampledUrl", fixedWidthDownsampledUrl).append("fixedWidthDownsampledWidth", fixedWidthDownsampledWidth).append("fixedWidthDownsampledHeight", fixedWidthDownsampledHeight).append("fixedHeightSmallUrl", fixedHeightSmallUrl).append("fixedHeightSmallStillUrl", fixedHeightSmallStillUrl).append("fixedHeightSmallWidth", fixedHeightSmallWidth).append("fixedHeightSmallHeight", fixedHeightSmallHeight).append("fixedWidthSmallUrl", fixedWidthSmallUrl).append("fixedWidthSmallStillUrl", fixedWidthSmallStillUrl).append("fixedWidthSmallWidth", fixedWidthSmallWidth).append("fixedWidthSmallHeight", fixedWidthSmallHeight).append("caption", caption).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(embedUrl).append(fixedHeightSmallWidth).append(fixedWidthSmallStillUrl).append(sourcePostUrl).append(fixedWidthDownsampledHeight).append(bitlyUrl).append(rating).append(caption).append(source).append(type).append(title).append(fixedHeightDownsampledUrl).append(fixedWidthSmallHeight).append(sourceTld).append(imageUrl).append(fixedHeightSmallUrl).append(id).append(bitlyGifUrl).append(fixedWidthSmallUrl).append(fixedWidthSmallWidth).append(slug).append(importDatetime).append(imageWidth).append(fixedWidthDownsampledUrl).append(fixedHeightSmallStillUrl).append(fixedHeightSmallHeight).append(trendingDatetime).append(fixedHeightDownsampledHeight).append(url).append(imageMp4Url).append(imageHeight).append(contentUrl).append(isSticker).append(imageOriginalUrl).append(imageFrames).append(fixedWidthDownsampledWidth).append(fixedHeightDownsampledWidth).append(username).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof Data_)) {
            return false;
        }
        Data_ rhs = ((Data_) other);
        return new EqualsBuilder().append(embedUrl, rhs.embedUrl).append(fixedHeightSmallWidth,
                rhs.fixedHeightSmallWidth).append(fixedWidthSmallStillUrl, rhs.fixedWidthSmallStillUrl).append(sourcePostUrl, rhs.sourcePostUrl).append(fixedWidthDownsampledHeight, rhs.fixedWidthDownsampledHeight).append(bitlyUrl, rhs.bitlyUrl).append(rating, rhs.rating).append(caption, rhs.caption).append(source, rhs.source).append(type, rhs.type).append(title, rhs.title).append(fixedHeightDownsampledUrl, rhs.fixedHeightDownsampledUrl).append(fixedWidthSmallHeight, rhs.fixedWidthSmallHeight).append(sourceTld, rhs.sourceTld).append(imageUrl, rhs.imageUrl).append(fixedHeightSmallUrl, rhs.fixedHeightSmallUrl).append(id, rhs.id).append(bitlyGifUrl, rhs.bitlyGifUrl).append(fixedWidthSmallUrl, rhs.fixedWidthSmallUrl).append(fixedWidthSmallWidth, rhs.fixedWidthSmallWidth).append(slug, rhs.slug).append(importDatetime, rhs.importDatetime).append(imageWidth, rhs.imageWidth).append(fixedWidthDownsampledUrl, rhs.fixedWidthDownsampledUrl).append(fixedHeightSmallStillUrl, rhs.fixedHeightSmallStillUrl).append(fixedHeightSmallHeight, rhs.fixedHeightSmallHeight).append(trendingDatetime, rhs.trendingDatetime).append(fixedHeightDownsampledHeight, rhs.fixedHeightDownsampledHeight).append(url, rhs.url).append(imageMp4Url, rhs.imageMp4Url).append(imageHeight, rhs.imageHeight).append(contentUrl, rhs.contentUrl).append(isSticker, rhs.isSticker).append(imageOriginalUrl, rhs.imageOriginalUrl).append(imageFrames, rhs.imageFrames).append(fixedWidthDownsampledWidth, rhs.fixedWidthDownsampledWidth).append(fixedHeightDownsampledWidth, rhs.fixedHeightDownsampledWidth).append(username, rhs.username).isEquals();
    }

}
