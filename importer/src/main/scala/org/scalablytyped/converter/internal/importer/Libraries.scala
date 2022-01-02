package org.scalablytyped.converter.internal
package importer

import org.scalablytyped.converter.internal.ts.TsIdentLibrary

import scala.collection.immutable.SortedSet

object Libraries {

  /**
    * A good combination of interesting libraries, and libraries that are needed by libs in DT.
    */
  val extraExternals: SortedSet[TsIdentLibrary] = awsSdk ++ expo ++ SortedSet(
    "activex-helpers",
    "adal-node",
    "ajv-keywords",
    "androiduix",
    "@angular/animations",
    "@angular/common",
    "@angular/compiler",
    "@angular/core",
    "@angular/forms",
    "@angular/http",
    "@angular/platform-browser",
    "@angular/platform-browser-dynamic",
    "@angular/router",
    "antd",
    "@ant-design/colors",
    "@ant-design/dark-theme",
    "@ant-design/icons",
    "@ant-design/icons-angular",
    "@ant-design/icons-react",
    "@ant-design/icons-react-native",
    "@ant-design/icons-vue",
    "ant-design-pro",
    "@ant-design/pro-layout",
    "@ant-design/react-native",
    "antd-mobile",
    "antd-mobile-rn",
    "@antv/adjust",
    "@antv/attr",
    "@antv/component",
    "@antv/coord",
    "@antv/data-set",
    "@antv/scale",
    "@antv/util",
    "api-service",
    "apollo-client",
    "apollo-link-http-common",
    "apollo-react",
    "apollo-server",
    "@asymmetrik/leaflet-d3",
    "authmosphere",
    "ava",
    "@babel/runtime",
    "@babel/types",
    "blake2s-js",
    "@blueprintjs/core",
    "@blueprintjs/datetime",
    "@blueprintjs/icons",
    "@blueprintjs/select",
    "@blueprintjs/table",
    "@blueprintjs/timezone",
    "broadcast-channel",
    "browserfs",
    "buffer",
    "cac",
    "cash-dom",
    "css-select",
    "csw-aas-js",
    "downshift",
    "dva",
    "@elastic/elasticsearch",
    "email-regex",
    "ember-cli-babel",
    "emotion",
    "@emotion/native",
    "@emotion/react",
    "ethereumjs-account",
    "ethereumjs-vm",
    "ethereumjs-wallet",
    "ethers",
    "express-frappe",
    "fast-future",
    "fastify",
    "filepond",
    "final-form",
    "firebase",
    "firebase-admin",
    "formik",
    "formstate",
    "formsy-react",
    "@fortawesome/fontawesome-svg-core",
    "@fortawesome/free-solid-svg-icons",
    "@fortawesome/react-fontawesome",
    "fp-ts",
    "fs-jetpack",
    "fullcalendar",
    "gatsby",
    "gatsby-cli",
    "gatsby-image",
    "gestalt",
    "glaze",
    "graphql-tools",
    "grommet",
    "@grpc/proto-loader",
    "highcharts",
    "highcharts-react-official",
    "hot-shots",
    "human-signals",
    "@hyperloris/tyson",
    "ieee754",
    "import-from",
    "indefinite-observable",
    "instagram-private-api",
    "ionic",
    "@ionic/angular",
    "@ionic/core",
    "@ionic/react",
    "@ionic/storage",
    "io-ts",
    "ipfs",
    "is-wsl",
    "jest-cucumber",
    "js-joda",
    "@jupyterlab/metapackage",
    "konva",
    "lcid",
    "libphonenumber-js",
    "logrocket",
    "lottie-web",
    "@mui/icons-material",
    "@mui/lab",
    "@mui/material",
    "@material-ui/core",
    "@material-ui/icons",
    "@material-ui/lab",
    "@maxim_mazurok/gapi.client.abusiveexperiencereport",
    "@maxim_mazurok/gapi.client.acceleratedmobilepageurl",
    "@maxim_mazurok/gapi.client.accessapproval",
    "@maxim_mazurok/gapi.client.accesscontextmanager",
    "@maxim_mazurok/gapi.client.adexchangebuyer",
    "@maxim_mazurok/gapi.client.adexchangebuyer2",
    "@maxim_mazurok/gapi.client.adexperiencereport",
    "@maxim_mazurok/gapi.client.admin",
    "@maxim_mazurok/gapi.client.admob",
    "@maxim_mazurok/gapi.client.adsense",
    "@maxim_mazurok/gapi.client.adsensehost",
    "@maxim_mazurok/gapi.client.alertcenter",
    "@maxim_mazurok/gapi.client.analytics",
    "@maxim_mazurok/gapi.client.analyticsadmin",
    "@maxim_mazurok/gapi.client.analyticsdata",
    "@maxim_mazurok/gapi.client.analyticsreporting",
    "@maxim_mazurok/gapi.client.androiddeviceprovisioning",
    "@maxim_mazurok/gapi.client.androidenterprise",
    "@maxim_mazurok/gapi.client.androidmanagement",
    "@maxim_mazurok/gapi.client.androidpublisher",
    "@maxim_mazurok/gapi.client.apigateway",
    "@maxim_mazurok/gapi.client.appengine",
    "@maxim_mazurok/gapi.client.area120tables",
    "@maxim_mazurok/gapi.client.artifactregistry",
    "@maxim_mazurok/gapi.client.assuredworkloads",
    "@maxim_mazurok/gapi.client.bigquery",
    "@maxim_mazurok/gapi.client.bigqueryconnection",
    "@maxim_mazurok/gapi.client.bigquerydatatransfer",
    "@maxim_mazurok/gapi.client.bigqueryreservation",
    "@maxim_mazurok/gapi.client.bigtableadmin",
    "@maxim_mazurok/gapi.client.billingbudgets",
    "@maxim_mazurok/gapi.client.binaryauthorization",
    "@maxim_mazurok/gapi.client.blogger",
    "@maxim_mazurok/gapi.client.books",
    "@maxim_mazurok/gapi.client.calendar",
    "@maxim_mazurok/gapi.client.chat",
    "@maxim_mazurok/gapi.client.chromeuxreport",
    "@maxim_mazurok/gapi.client.civicinfo",
    "@maxim_mazurok/gapi.client.classroom",
    "@maxim_mazurok/gapi.client.cloudasset",
    "@maxim_mazurok/gapi.client.cloudbilling",
    "@maxim_mazurok/gapi.client.cloudbuild",
    "@maxim_mazurok/gapi.client.clouddebugger",
    "@maxim_mazurok/gapi.client.clouderrorreporting",
    "@maxim_mazurok/gapi.client.cloudfunctions",
    "@maxim_mazurok/gapi.client.cloudidentity",
    "@maxim_mazurok/gapi.client.cloudiot",
    "@maxim_mazurok/gapi.client.cloudkms",
    "@maxim_mazurok/gapi.client.cloudprofiler",
    "@maxim_mazurok/gapi.client.cloudresourcemanager",
    "@maxim_mazurok/gapi.client.cloudscheduler",
    "@maxim_mazurok/gapi.client.cloudsearch",
    "@maxim_mazurok/gapi.client.cloudshell",
    "@maxim_mazurok/gapi.client.cloudtasks",
    "@maxim_mazurok/gapi.client.cloudtrace",
    "@maxim_mazurok/gapi.client.composer",
    "@maxim_mazurok/gapi.client.compute",
    "@maxim_mazurok/gapi.client.container",
    "@maxim_mazurok/gapi.client.containeranalysis",
    "@maxim_mazurok/gapi.client.content",
    "@maxim_mazurok/gapi.client.customsearch",
    "@maxim_mazurok/gapi.client.datacatalog",
    "@maxim_mazurok/gapi.client.dataflow",
    "@maxim_mazurok/gapi.client.datafusion",
    "@maxim_mazurok/gapi.client.datalabeling",
    "@maxim_mazurok/gapi.client.datamigration",
    "@maxim_mazurok/gapi.client.dataproc",
    "@maxim_mazurok/gapi.client.datastore",
    "@maxim_mazurok/gapi.client.deploymentmanager",
    "@maxim_mazurok/gapi.client.dfareporting",
    "@maxim_mazurok/gapi.client.dialogflow",
    "@maxim_mazurok/gapi.client.digitalassetlinks",
    "@maxim_mazurok/gapi.client.discovery",
    "@maxim_mazurok/gapi.client.displayvideo",
    "@maxim_mazurok/gapi.client.dlp",
    "@maxim_mazurok/gapi.client.dns",
    "@maxim_mazurok/gapi.client.docs",
    "@maxim_mazurok/gapi.client.domains",
    "@maxim_mazurok/gapi.client.domainsrdap",
    "@maxim_mazurok/gapi.client.doubleclickbidmanager",
    "@maxim_mazurok/gapi.client.doubleclicksearch",
    "@maxim_mazurok/gapi.client.drive",
    "@maxim_mazurok/gapi.client.driveactivity",
    "@maxim_mazurok/gapi.client.eventarc",
    "@maxim_mazurok/gapi.client.factchecktools",
    "@maxim_mazurok/gapi.client.fcm",
    "@maxim_mazurok/gapi.client.file",
    "@maxim_mazurok/gapi.client.firebase",
    "@maxim_mazurok/gapi.client.firebasedatabase",
    "@maxim_mazurok/gapi.client.firebasedynamiclinks",
    "@maxim_mazurok/gapi.client.firebasehosting",
    "@maxim_mazurok/gapi.client.firebaseml",
    "@maxim_mazurok/gapi.client.firebaserules",
    "@maxim_mazurok/gapi.client.firestore",
    "@maxim_mazurok/gapi.client.fitness",
    "@maxim_mazurok/gapi.client.games",
    "@maxim_mazurok/gapi.client.gamesconfiguration",
    "@maxim_mazurok/gapi.client.gameservices",
    "@maxim_mazurok/gapi.client.gamesmanagement",
    "@maxim_mazurok/gapi.client.genomics",
    "@maxim_mazurok/gapi.client.gmail",
    "@maxim_mazurok/gapi.client.gmailpostmastertools",
    "@maxim_mazurok/gapi.client.groupsmigration",
    "@maxim_mazurok/gapi.client.groupssettings",
    "@maxim_mazurok/gapi.client.healthcare",
    "@maxim_mazurok/gapi.client.homegraph",
    "@maxim_mazurok/gapi.client.iam",
    "@maxim_mazurok/gapi.client.iamcredentials",
    "@maxim_mazurok/gapi.client.iap",
    "@maxim_mazurok/gapi.client.identitytoolkit",
    "@maxim_mazurok/gapi.client.indexing",
    "@maxim_mazurok/gapi.client.jobs",
    "@maxim_mazurok/gapi.client.kgsearch",
    "@maxim_mazurok/gapi.client.language",
    "@maxim_mazurok/gapi.client.libraryagent",
    "@maxim_mazurok/gapi.client.licensing",
    "@maxim_mazurok/gapi.client.lifesciences",
    "@maxim_mazurok/gapi.client.localservices",
    "@maxim_mazurok/gapi.client.logging",
    "@maxim_mazurok/gapi.client.managedidentities",
    "@maxim_mazurok/gapi.client.manufacturers",
    "@maxim_mazurok/gapi.client.memcache",
    "@maxim_mazurok/gapi.client.ml",
    "@maxim_mazurok/gapi.client.monitoring",
    "@maxim_mazurok/gapi.client.networkmanagement",
    "@maxim_mazurok/gapi.client.notebooks",
    "@maxim_mazurok/gapi.client.oauth2",
    "@maxim_mazurok/gapi.client.osconfig",
    "@maxim_mazurok/gapi.client.oslogin",
    "@maxim_mazurok/gapi.client.pagespeedonline",
    "@maxim_mazurok/gapi.client.people",
    "@maxim_mazurok/gapi.client.playablelocations",
    "@maxim_mazurok/gapi.client.playcustomapp",
    "@maxim_mazurok/gapi.client.policytroubleshooter",
    "@maxim_mazurok/gapi.client.poly",
    "@maxim_mazurok/gapi.client.privateca",
    "@maxim_mazurok/gapi.client.prod_tt_sasportal",
    "@maxim_mazurok/gapi.client.pubsub",
    "@maxim_mazurok/gapi.client.pubsublite",
    "@maxim_mazurok/gapi.client.realtimebidding",
    "@maxim_mazurok/gapi.client.recommendationengine",
    "@maxim_mazurok/gapi.client.recommender",
    "@maxim_mazurok/gapi.client.redis",
    "@maxim_mazurok/gapi.client.remotebuildexecution",
    "@maxim_mazurok/gapi.client.reseller",
    "@maxim_mazurok/gapi.client.run",
    "@maxim_mazurok/gapi.client.runtimeconfig",
    "@maxim_mazurok/gapi.client.safebrowsing",
    "@maxim_mazurok/gapi.client.sasportal",
    "@maxim_mazurok/gapi.client.script",
    "@maxim_mazurok/gapi.client.searchconsole",
    "@maxim_mazurok/gapi.client.secretmanager",
    "@maxim_mazurok/gapi.client.securitycenter",
    "@maxim_mazurok/gapi.client.serviceconsumermanagement",
    "@maxim_mazurok/gapi.client.servicecontrol",
    "@maxim_mazurok/gapi.client.servicedirectory",
    "@maxim_mazurok/gapi.client.servicemanagement",
    "@maxim_mazurok/gapi.client.servicenetworking",
    "@maxim_mazurok/gapi.client.serviceusage",
    "@maxim_mazurok/gapi.client.sheets",
    "@maxim_mazurok/gapi.client.siteverification",
    "@maxim_mazurok/gapi.client.slides",
    "@maxim_mazurok/gapi.client.smartdevicemanagement",
    "@maxim_mazurok/gapi.client.sourcerepo",
    "@maxim_mazurok/gapi.client.spanner",
    "@maxim_mazurok/gapi.client.speech",
    "@maxim_mazurok/gapi.client.sqladmin",
    "@maxim_mazurok/gapi.client.storage",
    "@maxim_mazurok/gapi.client.storagetransfer",
    "@maxim_mazurok/gapi.client.streetviewpublish",
    "@maxim_mazurok/gapi.client.sts",
    "@maxim_mazurok/gapi.client.tagmanager",
    "@maxim_mazurok/gapi.client.testing",
    "@maxim_mazurok/gapi.client.texttospeech",
    "@maxim_mazurok/gapi.client.toolresults",
    "@maxim_mazurok/gapi.client.tpu",
    "@maxim_mazurok/gapi.client.trafficdirector",
    "@maxim_mazurok/gapi.client.transcoder",
    "@maxim_mazurok/gapi.client.translate",
    "@maxim_mazurok/gapi.client.vault",
    "@maxim_mazurok/gapi.client.vectortile",
    "@maxim_mazurok/gapi.client.verifiedaccess",
    "@maxim_mazurok/gapi.client.videointelligence",
    "@maxim_mazurok/gapi.client.vision",
    "@maxim_mazurok/gapi.client.webfonts",
    "@maxim_mazurok/gapi.client.webmasters",
    "@maxim_mazurok/gapi.client.websecurityscanner",
    "@maxim_mazurok/gapi.client.workflows",
    "@maxim_mazurok/gapi.client.youtube",
    "@maxim_mazurok/gapi.client.youtubeanalytics",
    "@maxim_mazurok/gapi.client.youtubereporting",
    "mdast-util-to-string",
    "merkle-patricia-tree",
    "meteor-typings",
    "@microsoft/load-themed-styles",
    "mimic-response",
    "@mindbox/redux-helpers",
    "minecraft-scripting-types-client",
    "minecraft-scripting-types-server",
    "mobx-react",
    "mobx-react-devtools",
    "mobx-remotedev",
    "mobx-state-tree",
    "monaco-editor",
    "monocle-ts",
    "mysql2",
    "@mysticatea/spy",
    "nats",
    "nested-property",
    "ngx-infinite-scroll",
    "@nivo/axes",
    "@nivo/bar",
    "@nivo/bullet",
    "@nivo/calendar",
    "@nivo/chord",
    "@nivo/circle-packing",
    "@nivo/core",
    "@nivo/generators",
    "@nivo/geo",
    "@nivo/heatmap",
    "@nivo/legends",
    "@nivo/line",
    "@nivo/parallel-coordinates",
    "@nivo/pie",
    "@nivo/radar",
    "@nivo/sankey",
    "@nivo/scales",
    "@nivo/scatterplot",
    "@nivo/stream",
    "@nivo/sunburst",
    "@nivo/treemap",
    "@nivo/voronoi",
    "@nivo/waffle",
    "objection",
    "@octokit/rest",
    "office-ui-fabric-react",
    "onsenui",
    "openapi-types",
    "opentracing",
    "parent-module",
    "phaser",
    "@phenomnomnominal/tsquery",
    "pinata-sdk",
    "popmotion",
    "popmotion-pose",
    "preact",
    "prepend-http",
    "primereact",
    "prisma-binding",
    "promise-worker",
    "@protobufjs/aspromise",
    "@protobufjs/codegen",
    "@pulumi/aws",
    "@pulumi/cloud",
    "@pulumi/kubernetes",
    "@pulumi/pulumi",
    "rbx",
    "rc-collapse",
    "rc-swipeout",
    "react-ace",
    "react-apollo",
    "react-aria-modal",
    "react-async",
    "react-autosize-textarea",
    "react-avatar-editor",
    "react-base16-styling",
    "react-bulma-components",
    "react-date-range",
    "react-draggable-list",
    "react-emotion",
    "react-fns",
    "react-helmet",
    "react-image",
    "react-instantsearch",
    "react-json-view",
    "react-konva",
    "react-latex-next",
    "react-live",
    "react-localization",
    "react-markdown",
    "react-md",
    "react-mosaic-component",
    "@react-native-community/async-storage",
    "@react-native-community/cameraroll",
    "@react-native-community/masked-view",
    "@react-native-community/picker",
    "@react-native-community/segmented-control",
    "@react-native-community/slider",
    "@react-native-community/viewpager",
    "react-native-firebase",
    "@react-native-firebase/app",
    "react-native-gesture-handler",
    "react-native-paper",
    "react-native-reanimated",
    "react-native-screens",
    "react-native-svg",
    "react-native-windows",
    "@react-navigation/core",
    "react-navigation-drawer",
    "@react-navigation/native",
    "react-navigation-stack",
    "react-phone-number-input",
    "react-player",
    "react-popper",
    "react-pose",
    "react-spinners",
    "react-svg",
    "react-testing-library",
    "react-themeable-ts",
    "react-three-fiber",
    "react-toggled",
    "react-toolbox",
    "react-tools",
    "react-waypoint",
    "react-widgets",
    "react-window",
    "reapop",
    "reaptcha",
    "rebass",
    "redbox-react",
    "redux-observable",
    "remark",
    "remark-parse",
    "re-reselect",
    "reselect",
    "rmc-calendar",
    "rmc-date-picker",
    "rmc-picker",
    "rollup-typescript",
    "rxjs",
    "rxjs-compat",
    "saucelabs",
    "sdp",
    "semantic-ui-form",
    "semantic-ui-react",
    "@sentry/browser",
    "signals.js",
    "snabbdom",
    "sodiumjs",
    "sort-keys",
    "source-map-support",
    "storm-react-diagrams",
    "styled-components",
    "superagent-proxy",
    "sw-toolbox",
    "sync-request",
    "tensorflow",
    "@tensorflow/tfjs",
    "@tensorflow/tfjs-node",
    "tensorscript",
    "to-fast-properties",
    "treat",
    "tslint",
    "ts-mockito",
    "ts-toolbelt",
    "@tweenjs/tween.js",
    "twilio-chat",
    "typed-github-api",
    "typed-graphql",
    "typedoc",
    "typed-rest-client",
    "typed-undo",
    "typeorm",
    "typesafe-actions",
    "typescript-optional",
    "typestub-ipfs",
    "@uifabric/merge-styles",
    "@uifabric/styling",
    "@uirouter/angularjs",
    "vscode-languageclient",
    "vscode-languageserver",
    "vscode-languageserver-types",
    "vue",
    "vue-class-component",
    "vue-cli",
    "vue-loader",
    "vue-router",
    "vue-rx",
    "vue-server-renderer",
    "@vue/test-utils",
    "vuex",
    "webdriver-manager",
    "@welldone-software/why-did-you-render",
    "what-input",
    "word",
    "xdg-trashdir",
    "xstream",
    "zipkin",
  ).map(TsIdentLibrary.apply)

  def ignored: SortedSet[TsIdentLibrary] =
    SortedSet[String](
      "ably",
      "tstl",
      "graphene-pk11",
      "rvo2",
      "yfiles",
      "chromecast-caf-receiver",
      "snoowrap",
      // bundles junk files
      "bottleneck",
      // these are referenced in notNeededPackages.json but don't exist
      "@sindresorhus/djb2a",
      "navigator-permissions",
      "webassembly-js-api",
      "w3c-permissions",
      // circular, and somehow breaks sequential mode?
      "koa-compose",
      // not installable on linux
      "fsevents",
      "raspi-gpio",
      "raspi-i2c",
      "raspi-serial",
      "raspi-led",
      "raspi-onewire",
      "raspi",
      "raspi-board",
      "raspi-soft-pwm",
      "windows-process-tree",
      // doesnt exists
      "xumm-api",
    ).map(TsIdentLibrary.apply)

  val Slow = SortedSet("@pulumi/aws", "aws-sdk", "googleapis", "@material-ui/core", "@storybook/components").map(
    TsIdentLibrary.apply,
  )

  /* These are all the libraries used in demos. The set doubles as the extended test set */
  val DemoSet: SortedSet[TsIdentLibrary] = expo ++ SortedSet(
    "@fortawesome/fontawesome-svg-core",
    "@fortawesome/free-solid-svg-icons",
    "@fortawesome/react-fontawesome",
    "@material-ui/core",
    "@material-ui/icons",
    "angular__common",
    "angular__compiler",
    "angular__core",
    "angular__forms",
    "angular__platform-browser",
    "angular__platform-browser-dynamic",
    "angular__router",
    "antd",
    "axios",
    "body-parser",
    "chart.js",
    "classnames",
    "connect",
    "core-js",
    "csstype",
    "d3",
    "d3-array",
    "d3-axis",
    "d3-brush",
    "d3-chord",
    "d3-collection",
    "d3-color",
    "d3-contour",
    "d3-dispatch",
    "d3-drag",
    "d3-dsv",
    "d3-ease",
    "d3-fetch",
    "d3-force",
    "d3-format",
    "d3-geo",
    "d3-hierarchy",
    "d3-interpolate",
    "d3-path",
    "d3-polygon",
    "d3-quadtree",
    "d3-random",
    "d3-scale",
    "d3-scale-chromatic",
    "d3-selection",
    "d3-shape",
    "d3-time",
    "d3-time-format",
    "d3-timer",
    "d3-transition",
    "d3-voronoi",
    "d3-zoom",
    "electron",
    "exenv",
    "express",
    "express-serve-static-core",
    "extract-zip",
    "geojson",
    "google.maps",
    "highlight.js",
    "hoist-non-react-statics",
    "is-buffer",
    "jquery",
    "jqueryui",
    "leaflet",
    "lodash",
    "material-ui",
    "mime",
    "mobx",
    "mobx-react",
    "moment",
    "node",
    "onsenui",
    "p5",
    "prop-types",
    "range-parser",
    "react",
    "react-addons-linked-state-mixin",
    "react-big-calendar",
    "react-dom",
    "react-is",
    "react-lifecycles-compat",
    "react-native",
    "react-native-gesture-handler",
    "react-native-vector-icons",
    "react-navigation",
    "react-navigation-drawer",
    "react-navigation-stack",
    "react-redux",
    "react-router-dom",
    "react-router-native",
    "react-slick",
    "redux",
    "redux-devtools-extension",
    "reveal",
    "rxjs",
    "semantic-ui-react",
    "semantic-ui-react__event-stack",
    "serve-static",
    "shallowequal",
    "sizzle",
    "std",
    "storybook__react",
    "styled-components",
    "symbol-observable",
    "three",
    "tslib",
    "typescript",
    "vue",
    "webpack-env",
    "yandex-maps",
    "zone.js",
  ).map(TsIdentLibrary.apply)

  def expo: SortedSet[TsIdentLibrary] =
    SortedSet(
      "@expo/vector-icons",
      "expo",
      "expo-asset",
      "expo-constants",
      "expo-file-system",
      "expo-font",
      "expo-keep-awake",
      "expo-linear-gradient",
      "expo-location",
      "expo-permissions",
      "expo-sqlite",
      "expo-web-browser",
    ).map(TsIdentLibrary.apply)

  def awsSdk: SortedSet[TsIdentLibrary] =
    SortedSet(
      "@aws-sdk/abort-controller",
      "@aws-sdk/add-glacier-checksum-headers-browser",
      "@aws-sdk/add-glacier-checksum-headers-node",
      "@aws-sdk/add-glacier-checksum-headers-universal",
      "@aws-sdk/apply-body-checksum-middleware",
      "@aws-sdk/bucket-endpoint-middleware",
      "@aws-sdk/build-types",
      "@aws-sdk/chunked-blob-reader",
      "@aws-sdk/chunked-stream-reader-node",
      "@aws-sdk/client-codecommit-node",
      "@aws-sdk/client-cognito-identity-browser",
      "@aws-sdk/client-dynamodb-browser",
      "@aws-sdk/client-dynamodb-node",
      "@aws-sdk/client-glacier-node",
      "@aws-sdk/client-kinesis-browser",
      "@aws-sdk/client-kms-browser",
      "@aws-sdk/client-kms-node",
      "@aws-sdk/client-lambda-node",
      "@aws-sdk/client-pinpoint-browser",
      "@aws-sdk/client-s3-browser",
      "@aws-sdk/client-s3-node",
      "@aws-sdk/client-sqs-node",
      "@aws-sdk/client-xray-node",
      "@aws-sdk/config-resolver",
      "@aws-sdk/core-handler",
      "@aws-sdk/credential-provider-cognito-identity",
      "@aws-sdk/credential-provider-env",
      "@aws-sdk/credential-provider-imds",
      "@aws-sdk/credential-provider-ini",
      "@aws-sdk/credential-provider-node",
      "@aws-sdk/credential-provider-process",
      "@aws-sdk/ec2-error-unmarshaller",
      "@aws-sdk/eventstream-marshaller",
      "@aws-sdk/fetch-http-handler",
      "@aws-sdk/hash-blob-browser",
      "@aws-sdk/hash-node",
      "@aws-sdk/hash-stream-node",
      "@aws-sdk/http-headers",
      "@aws-sdk/http-serialization",
      "@aws-sdk/is-array-buffer",
      "@aws-sdk/is-iterable",
      "@aws-sdk/is-node",
      "@aws-sdk/json-builder",
      "@aws-sdk/json-error-unmarshaller",
      "@aws-sdk/json-parser",
      "@aws-sdk/karma-credential-loader",
      "@aws-sdk/location-constraint-middleware",
      "@aws-sdk/logger",
      "@aws-sdk/md5-js",
      "@aws-sdk/md5-universal",
      "@aws-sdk/middleware-content-length",
      "@aws-sdk/middleware-ec2-copysnapshot",
      "@aws-sdk/middleware-expect-continue",
      "@aws-sdk/middleware-header-default",
      "@aws-sdk/middleware-input-default",
      "@aws-sdk/middleware-operation-logging",
      "@aws-sdk/middleware-rds-presignedurl",
      "@aws-sdk/middleware-sdk-api-gateway",
      "@aws-sdk/middleware-sdk-glacier",
      "@aws-sdk/middleware-serializer",
      "@aws-sdk/middleware-stack",
      "@aws-sdk/modeled-endpoint-middleware",
      "@aws-sdk/node-http-handler",
      "@aws-sdk/property-provider",
      "@aws-sdk/protocol-json-rpc",
      "@aws-sdk/protocol-query",
      "@aws-sdk/protocol-rest",
      "@aws-sdk/protocol-timestamp",
      "@aws-sdk/query-builder",
      "@aws-sdk/query-error-unmarshaller",
      "@aws-sdk/query-request-presigner",
      "@aws-sdk/querystring-builder",
      "@aws-sdk/querystring-parser",
      "@aws-sdk/region-provider",
      "@aws-sdk/remove-sensitive-logs",
      "@aws-sdk/response-metadata-extractor",
      "@aws-sdk/retry-middleware",
      "@aws-sdk/route53-id-normalizer-middleware",
      "@aws-sdk/s3-error-unmarshaller",
      "@aws-sdk/s3-request-presigner",
      "@aws-sdk/service-error-classification",
      "@aws-sdk/service-model",
      "@aws-sdk/sha256-tree-hash",
      "@aws-sdk/shared-ini-file-loader",
      "@aws-sdk/signature-v4-browser",
      "@aws-sdk/signature-v4-node",
      "@aws-sdk/signature-v4-universal",
      "@aws-sdk/signature-v4",
      "@aws-sdk/signing-middleware",
      "@aws-sdk/ssec-middleware",
      "@aws-sdk/stream-collector-browser",
      "@aws-sdk/stream-collector-node",
      "@aws-sdk/types",
      "@aws-sdk/url-parser-browser",
      "@aws-sdk/url-parser-node",
      "@aws-sdk/url-parser-universal",
      "@aws-sdk/util-base64-browser",
      "@aws-sdk/util-base64-node",
      "@aws-sdk/util-base64-universal",
      "@aws-sdk/util-body-length-browser",
      "@aws-sdk/util-body-length-node",
      "@aws-sdk/util-buffer-from",
      "@aws-sdk/util-create-request",
      "@aws-sdk/util-error-constructor",
      "@aws-sdk/util-format-url",
      "@aws-sdk/util-hex-encoding",
      "@aws-sdk/util-locate-window",
      "@aws-sdk/util-uri-escape",
      "@aws-sdk/util-user-agent-browser",
      "@aws-sdk/util-user-agent-node",
      "@aws-sdk/util-utf8-browser",
      "@aws-sdk/util-utf8-node",
      "@aws-sdk/util-utf8-universal",
      "@aws-sdk/xml-body-builder",
      "@aws-sdk/xml-body-parser",
      "@aws-sdk/xml-builder",
    ).map(TsIdentLibrary.apply)
}
