---
version: alpha
name: Aseman Day
colors:
  primary: "#3389FF"
  secondary: "#4A6B94"
  tertiary: "#FF753E"
  neutral: "#FFFCF6"
  on-surface: "#1E2A3A"
  error: "#E5484D"
typography:
  h1-temp:
    fontFamily: Peyda
    fontSize: 64px
    fontWeight: 700
    lineHeight: 1.0
  h2:
    fontFamily: Peyda
    fontSize: 28px
    fontWeight: 600
    lineHeight: 1.2
  body-lg:
    fontFamily: Peyda
    fontSize: 18px
    fontWeight: 400
    lineHeight: 1.5
  body-md:
    fontFamily: Peyda
    fontSize: 16px
    fontWeight: 400
    lineHeight: 1.5
  label-md:
    fontFamily: Peyda
    fontSize: 13px
    fontWeight: 500
    lineHeight: 1.3
rounded:
  sm: 12px
  md: 20px
  lg: 28px
  full: 9999px
spacing:
  xs: 4px
  sm: 8px
  md: 16px
  lg: 24px
  xl: 32px
  margin: 16px
  gutter: 16px
components:
  button-primary:
    backgroundColor: "{colors.primary}"
    textColor: "{colors.neutral}"
    rounded: "{rounded.full}"
    padding: 14px
  card-weather-hero:
    backgroundColor: "{colors.primary}"
    textColor: "{colors.neutral}"
    rounded: "{rounded.lg}"
    padding: 24px
  card-stat:
    backgroundColor: "{colors.neutral}"
    textColor: "{colors.on-surface}"
    rounded: "{rounded.md}"
    padding: 16px
  nav-bar-floating:
    backgroundColor: "{colors.neutral}"
    textColor: "{colors.secondary}"
    rounded: "{rounded.full}"
    padding: 12px
  modal-sheet:
    backgroundColor: "{colors.neutral}"
    textColor: "{colors.on-surface}"
    rounded: "{rounded.lg}"
    padding: 20px
---

# Design System — آسمان (نسخه روز)

## Overview
اپلیکیشن هواشناسی فارسی «آسمان» با تگ‌لاین «آب‌وهوا رو ساده ببین». حس‌وحال نسخه‌ی روز: روشن، آفتابی، دوستانه، تمیز. زبان بصری آیکون‌ها **سه‌بعدی نرم و شیشه‌ای (Soft 3D / Glassy)** است — دقیقاً هم‌سبک با لوگوی اپ (ابر و خورشیدِ گلاسی). هیچ آیکون فلت یا ایلوستریشن منظره‌ای (شتر، گوزن، کاکتوس و مشابه) در این پروژه استفاده نمی‌شود؛ آن مراجع فقط برای الگوی چیدمان و سایزبندی به کار رفته‌اند، نه سبک بصری.

رابط کاربری کاملاً **راست‌چین (RTL)** و به **زبان فارسی** است. تمام اعداد (دما، تاریخ، ساعت، درصدها) باید با **ارقام فارسی** نمایش داده شوند، نه لاتین. تاریخ‌ها **شمسی** هستند.

## Colors
- **Primary (#3389FF):** آبی آسمانی — کارت اصلی هوا، دکمه‌های اصلی، عناصر تعاملی کلیدی
- **Secondary (#4A6B94):** آبی-خاکستری — متن ثانویه، آیکون‌های غیرفعال، لیبل‌ها
- **Tertiary (#FF753E):** نارنجی گرم — هشدارها، بنر «نکته هوشمند»، شاخص‌های داغ/UV بالا
- **Neutral (#FFFCF6):** سفید-کِرم گرم — پس‌زمینه اصلی صفحات و کارت‌های آماری
- **On-surface (#1E2A3A):** متن اصلی روی پس‌زمینه‌ی روشن
- **Error (#E5484D):** خطاها، اعلان‌های هشدار حاد

## Typography
- فونت واحد در تمام سطوح: **Peyda** (فارسی)
- تیتر دما (h1-temp): درشت‌ترین عنصر صفحه، همیشه اولین چیزی که چشم می‌بیند
- بدون حروف بزرگ/کوچک (uppercase) در لیبل‌ها — فارسی حالت حرفی ندارد؛ تمایز فقط با وزن و سایز فونت ایجاد می‌شود

## Layout
سیستم spacing بر پایه ۸px. حاشیه‌ی صفحه ۱۶px. کارت‌ها با gap ۱۶px از هم فاصله دارند. چیدمان صفحه‌ی اصلی به‌ترتیب لایه‌ای: کارت Hero → بنر هوشمند → گرید آماری → پیش‌بینی ساعتی افقی → پیش‌بینی روزانه عمودی.

## Elevation & Depth
عمق با **سایه‌ی نرم و رنگی** (نه سایه‌ی خاکستری معمولی) ایجاد می‌شود؛ مثلاً کارت آبی Hero سایه‌ای با تینت آبی کم‌رنگ زیر خودش دارد. کارت‌های آماری روی زمینه‌ی کرم، صاف و بدون سایه‌ی سنگین هستند — عمق بیشتر از طریق کنتراست رنگی حاصل می‌شود.

## Shapes
شعاع گوشه‌ها بزرگ و نرم (۱۲ تا ۲۸px)، هماهنگ با حس گلاسی/نرم آیکون‌ها. دکمه‌ها کاملاً بیضی (rounded-full).

## Components
- **کارت Hero هوا:** آبی primary، گوشه‌ی بزرگ، آیکون گلاسی بزرگ، دما درشت
- **کارت‌های آماری:** پس‌زمینه کرم، آیکون کوچک گلاسی + عدد + لیبل
- **نوار ناوبری شناور:** سه آیتم (امروز، شهرها، تنظیمات)، شناور با فاصله از پایین صفحه، گوشه کاملاً گرد
- **مودال/باتم‌شیت:** برای پنجره‌های کوچک مثل «درباره برنامه»، از پایین صفحه بالا می‌آید

## Do's and Don'ts
- Do از ارقام فارسی و تاریخ شمسی در همه‌جا استفاده کن
- Do آیکون‌های جهت‌دار (فلش برگشت و مشابه) را برای راست‌چین آینه کن
- Do توضیحات نوار ناوبری شناور را عیناً و یکسان در هر صفحه تکرار کن تا پیکسل‌به‌پیکسل یکی بماند
- Don't بیش از یک رنگ accent در هر صفحه استفاده نکن
- Don't از آیکون فلت/ایلوستریشن منظره‌ای استفاده نکن — فقط سبک گلاسی سه‌بعدی
- Don't بیش از ۵-۶ آیتم را در کارت Hero فشرده نکن؛ بقیه در گرید آماری زیر آن قرار می‌گیرند
