Create Database IF4101_AC_2021;

//*Script para cliente*//

Use IF4101_AC_2021;


CREATE TABLE [dbo].[Comment](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[description] [varchar](250) NOT NULL,
	[id_issue] [int] NULL,
	[report_number] [varchar](100) NULL,
	[Creation_Date] [date]  NULL,
	[Creation_User] [varchar](20)  NULL,
	[Update_Date] [date]  NULL,
	[Update_User] [varchar](20)  NULL,
 CONSTRAINT [PK_Comment] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Issue]    Script Date: 2/25/2020 12:37:30 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Issue](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[report_number] [varchar](100) NOT NULL,
	[address] [varchar](250) NOT NULL,
	[contact_phone] [varchar](50) NOT NULL,
	[contact_email] [varchar](50) NOT NULL,
	[status] [varchar](50) NOT NULL,
	[support_user_asigned] [varchar](50) NULL,
	[id_user] [int] NULL,
	[description] [varchar](50) NULL,
	[service] [varchar](50) NULL,
	[Creation_Date] [date]  NULL,
	[Creation_User] [varchar](20)  NULL,
	[Update_Date] [date]  NULL,
	[Update_User] [varchar](20)  NULL,
 CONSTRAINT [PK_Issue] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO


CREATE TABLE [dbo].[User](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[name] [varchar](50) NOT NULL,
	[first_surname] [varchar](50) NOT NULL,
	[second_surname] [varchar](50) NOT NULL,
	[address] [varchar](250) NOT NULL,
	[phone] [varchar](50) NOT NULL,
	[second_contact] [varchar](50) NOT NULL,
	[email] [varchar](50) NOT NULL,
	[password] [varchar](50) NOT NULL,
	[television] [int] NULL,
	[mobile_phone] [int] NULL,
	[telephone] [int] NULL,
	[internet] [int] NULL,
	[Creation_Date] [date]  NULL,
	[Creation_User] [varchar](20)  NULL,
	[Update_Date] [date]  NULL,
	[Update_User] [varchar](20)  NULL,
 CONSTRAINT [PK_User] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
ALTER TABLE [dbo].[Comment]  WITH CHECK ADD  CONSTRAINT [FK_Comment_Issue] FOREIGN KEY([id_issue])
REFERENCES [dbo].[Issue] ([id])
GO
ALTER TABLE [dbo].[Comment] CHECK CONSTRAINT [FK_Comment_Issue]
GO
ALTER TABLE [dbo].[Issue]  WITH CHECK ADD  CONSTRAINT [FK_Issue_User] FOREIGN KEY([id_user])
REFERENCES [dbo].[User] ([id])
GO
ALTER TABLE [dbo].[Issue] CHECK CONSTRAINT [FK_Issue_User]
GO

ALTER TABLE [dbo].[Issue] ADD  CONSTRAINT [DF_CreationDate_Issue]  DEFAULT (getdate()) FOR [Creation_Date]
GO

ALTER TABLE [dbo].[User] ADD  CONSTRAINT [DF_CreationDate_User]  DEFAULT (getdate()) FOR [Creation_Date]
GO

ALTER TABLE [dbo].[Comment] ADD  CONSTRAINT [DF_CreationDate_Comment]  DEFAULT (getdate()) FOR [Creation_Date]
GO