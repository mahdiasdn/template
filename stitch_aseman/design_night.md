---
version: alpha
name: Aseman Night
colors:
  primary: "#8A5CF6"
  secondary: "#FF6FA8"
  tertiary: "#FFC93C"
  neutral: "#121620"
  surface: "#1B2130"
  on-surface: "#F5F3FF"
  error: "#FF6B6B"
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
    textColor: "{colors.on-surface}"
    rounded: "{rounded.full}"
    padding: 14px
  card-weather-hero:
    backgroundColor: "{colors.primary}"
    textColor: "{colors.on-surface}"
    rounded: "{rounded.lg}"
    padding: 24px
  card-stat:
    backgroundColor: "{colors.surface}"
    textColor: "{colors.on-surface}"
    rounded: "{rounded.md}"
    padding: 16px
  nav-bar-floating:
    backgroundColor: "{colors.surface}"
    textColor: "{colors.on-surface}"
    rounded: "{rounded.full}"
    padding: 12px
  modal-sheet:
    backgroundColor: "{colors.surface}"
    textColor: "{colors.on-surface}"
    rounded: "{rounded.lg}"
    padding: 20px
---

# Design System — آسمان (نسخه شب)

## Overview
نسخه‌ی شب «آسمان» بر پایه‌ی زمینه‌ی تیره‌ی نزدیک به مشکی و کارت‌های گرادیانیِ بنفش-صورتی-طلایی (الهام از P1-4) است. حس‌وحال: آرام، شیک، پرکنتراست، ولی همچنان با همان زبان بصری آیکون‌های سه‌بعدی نرم و شیشه‌ای نسخه‌ی روز — فقط نورپردازی آیکون‌ها به‌جای گرم/آفتابی، سرد/درخشان می‌شود (مثلاً ماه به‌جای خورشید در آیکون ابر-صاف شب).

⚠️ رنگ‌های زیر بر اساس توصیف بصری تصویر مرجع تخمین زده شده‌اند (نه رنگ‌برداری دقیق پیکسلی) و باید بعد از اولین خروجی Stitch تایید یا اصلاح شوند.

ساختار RTL، فارسی، ارقام فارسی و تاریخ شمسی دقیقاً مثل نسخه‌ی روز است.

## Colors
- **Primary (#8A5CF6):** بنفش زنده — کارت اصلی هوا، دکمه‌های کلیدی
- **Secondary (#FF6FA8):** صورتی — نیمه‌ی دوم گرادیان‌های کارت اصلی، لهجه‌های تعاملی
- **Tertiary (#FFC93C):** طلایی — نشانه‌های ویژه/برجسته (مثل شاخص UV بالا یا هشدار)
- **Neutral (#121620):** پس‌زمینه‌ی اصلی، نزدیک به مشکی ولی نه مشکی خالص
- **Surface (#1B2130):** پس‌زمینه‌ی کارت‌های آماری، کمی روشن‌تر از neutral برای ایجاد عمق تونال
- **On-surface (#F5F3FF):** متن اصلی روی پس‌زمینه‌ی تیره
- **Error (#FF6B6B):** خطاها و هشدارهای حاد

## Typography
دقیقاً مطابق نسخه‌ی روز — فونت Peyda، همان سایزها و وزن‌ها، برای حفظ یکپارچگی بین دو حالت.

## Layout
دقیقاً مطابق نسخه‌ی روز (همان چیدمان لایه‌ای Hero → بنر → گرید آماری → پیش‌بینی ساعتی → پیش‌بینی روزانه).

## Elevation & Depth
عمق از طریق **لایه‌های تونال** ایجاد می‌شود، نه سایه‌ی تیره: پس‌زمینه‌ی اصلی تیره‌ترین سطح، کارت‌های آماری یک پله روشن‌تر (surface)، و کارت Hero با گرادیان بنفش-صورتی یک هاله‌ی نوری ملایم (glow) دور خودش دارد به‌جای سایه‌ی افتاده.

## Shapes
دقیقاً مطابق نسخه‌ی روز.

## Components
دقیقاً همان کامپوننت‌های نسخه‌ی روز، فقط با پالت رنگی این فایل. کارت Hero از گرادیان primary→secondary استفاده می‌کند (بنفش به صورتی)، مشابه کارت «Rain showers 29°» در P1-4.

## Do's and Don'ts
- Do از glow ملایم رنگی به‌جای سایه‌ی تیره برای نشان‌دادن عمق استفاده کن
- Do طلایی (tertiary) را فقط برای برجسته‌سازی‌های خاص و کمیاب نگه‌دار، نه به‌عنوان رنگ عمومی
- Don't از مشکی خالص (#000000) استفاده نکن؛ به‌جایش از neutral تعریف‌شده استفاده کن
- Don't ساختار چیدمان یا تایپوگرافی را نسبت به نسخه‌ی روز تغییر نده — فقط رنگ و الویشن فرق دارد
