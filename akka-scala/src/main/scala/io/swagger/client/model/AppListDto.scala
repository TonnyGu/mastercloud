/**
 * NOTE: This class is auto generated by the akka-scala (beta) swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen
 * For any issue or feedback, please open a ticket via https://github.com/swagger-api/swagger-codegen/issues/new
 */

package io.swagger.client.model

import io.swagger.client.core.ApiModel
import org.joda.time.DateTime
import java.util.UUID

case class AppListDto (
  id: Option[Int],
  displayName: Option[String],
  /* 概要 */
  summary: Option[String],
  /* 图片地址 */
  imageUrl: Option[String],
  appKey: Option[String],
  appEditionType: Option[AppEditionType],
  authorizeScope: Option[AppAuthorizeScope],
  /* 版本号 */
  version: Option[String],
  appStage: Option[AppStage],
  /* 更新时间 */
  updateTime: Option[Long]
) extends ApiModel


