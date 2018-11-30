/**
 * NOTE: This class is auto generated by the akka-scala (beta) swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen
 * For any issue or feedback, please open a ticket via https://github.com/swagger-api/swagger-codegen/issues/new
 */

package io.swagger.client.model

import io.swagger.client.core.ApiModel
import org.joda.time.DateTime
import java.util.UUID

case class AccountDto (
  id: Option[Int],
  /* 账户编号 */
  code: Option[String],
  /* 账户名称 */
  displayName: Option[String],
  /* 邮箱 */
  email: Option[String],
  /* 账户是否启用 */
  isActive: Option[Boolean],
  /* 创建时间 */
  createTime: Option[Long],
  /* 用户所在组 */
  ownGroupIds: Option[Seq[Int]]
) extends ApiModel


